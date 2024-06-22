import java.util.*;
class Song{
    int play;
    int index;
    Song(int play,int index){
        this.play=play;
        this.index=index;
    }
}
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        HashMap<String,Integer>totalplay=new HashMap<>();
        HashMap<String,List<Song>>songInfo=new HashMap<>();
        for(int i=0;i<genres.length;i++){
            totalplay.put(genres[i],totalplay.getOrDefault(genres[i],0)+plays[i]);//장르별 총합을 계산
            if(!songInfo.containsKey(genres[i])){
                songInfo.put(genres[i],new ArrayList<Song>());
            }//각 음악에 대한 정보를 장르별로 저장
            songInfo.get(genres[i]).add(new Song(plays[i],i));
        }
        List<String>genresList=new ArrayList<>(totalplay.keySet());
        Collections.sort(genresList,(a,b)->totalplay.get(b)-totalplay.get(a));
        
        List<Integer>result=new ArrayList<>();
        
        for(String genre:genresList){
            List<Song>songs=songInfo.get(genre);
            Collections.sort(songs,(a,b)->{
                if(a.play!=b.play) {return b.play-a.play;}
                else{return a.index-b.index;}
            });
            int count=0;
            for(Song song:songs){
            if(count==2)break;
            result.add(song.index);
            count++;
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}