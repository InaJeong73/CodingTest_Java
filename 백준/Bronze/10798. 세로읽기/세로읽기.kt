import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val words= Array(5){ reader.readLine()}
    val result=StringBuilder()
    val maxLength=words.maxOf{it.length}

    for(column in 0 until maxLength){
        for(row in 0 until 5){
            if(column<words[row].length){
            result.append(words[row][column])
            }
        }
    }
    println(result.toString())
}