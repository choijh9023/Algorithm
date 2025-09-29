import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val token = StringTokenizer(readLine())
    println(Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken()))
}