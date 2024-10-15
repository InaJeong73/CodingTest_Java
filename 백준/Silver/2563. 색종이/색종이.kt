import java.io.BufferedReader
import java.io.InputStreamReader


fun main(){
    val reader=BufferedReader(InputStreamReader(System.`in`))
    val paperCount=reader.readLine().toInt()
    val paper=Array(100){IntArray(100)}
    repeat(paperCount){
        val (x,y)=reader.readLine().split(" ").map{it.toInt()}
        for(dx in 0 until 10){
            for(dy in 0 until 10){
                paper[x+dx][y+dy]=1;
            }
        }
    }
    var area=0

    for(i in paper.indices){
        for(j in paper[i].indices){
            if(paper[i][j] == 1){
                area++;
            }
        }
    }
    print(area)
}