import java.util.*;
class Song{
    int index;
    int play;
    Song(int index,int play){
        this.index=index;
        this.play=play;
    }
}

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer>totalPlays=new HashMap<>();
        HashMap<String,ArrayList<Song>>songInfo=new HashMap<>();
        for(int i=0;i<genres.length;i++){
            totalPlays.put(genres[i],totalPlays.getOrDefault(genres[i],0)+plays[i]);
            if(!songInfo.containsKey(genres[i]))songInfo.put(genres[i],new ArrayList<>());
            songInfo.get(genres[i]).add(new Song(i,plays[i]));
        }
        List<String>list=new ArrayList<>(totalPlays.keySet());
        Collections.sort(list,(a,b)->totalPlays.get(b).compareTo(totalPlays.get(a)));
        ArrayList<Integer>result=new ArrayList<>();
        
        for(String s:list){
            ArrayList<Song>songinfo=songInfo.get(s);
            Collections.sort(songinfo,(a,b)->{
                if(a.play!=b.play){
                    return b.play-a.play;
                }else{
                    return a.index-b.index;
                }});
                int count=0;
                for(Song song:songinfo){
                    if(count==2)break;
                    result.add(song.index);
                    count++;
                }
            }
        int[]answer=result.stream().mapToInt(Integer::intValue).toArray();
        return answer;
        } 
    }
