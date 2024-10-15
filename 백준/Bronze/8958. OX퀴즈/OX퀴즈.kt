import java.io.BufferedReader
import java.io.InputStreamReader


fun main(){
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val testCaseCount = reader.readLine().toInt()
    repeat(testCaseCount) {
        val result = reader.readLine() // OX 퀴즈 결과 입력
        var score = 0
        var consecutiveO = 0

        for (char in result) {
            if (char == 'O') {
                consecutiveO++ 
                score += consecutiveO 
            } else {
                consecutiveO = 0 
            }
        }
        println(score)
    }
}