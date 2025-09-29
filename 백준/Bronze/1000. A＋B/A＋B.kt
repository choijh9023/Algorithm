import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val token = StringTokenizer(br.readLine())
    println(Integer.parseInt(token.nextToken()) + Integer.parseInt(token.nextToken()))
}