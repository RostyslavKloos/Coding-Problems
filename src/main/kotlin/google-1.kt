import kotlin.math.pow
import kotlin.math.sqrt

/*
 This problem was asked by Google.
 Given a set of points (x, y) on a 2D cartesian plane, find the two closest points. For example, given the points
 [(1, 1), (-1, -1), (3, 4), (6, 1), (-1, -6), (-4, -3)], return [(-1, -1), (1, 1)].
 */

fun getDistance(dot1: Pair<Int, Int>, dot2: Pair<Int, Int>): Double{

    return sqrt((dot2.first - dot1.first).toDouble().pow(2) + (dot2.second - dot1.second).toDouble().pow(2))
}

fun findShortestWay(list: List<Pair<Int, Int>>): List<Pair<Int,Int>>{
    var min = 0.0
    var c1 = Pair(0,0)
    var c2 = Pair(0,0)

    for (i in list.indices) {
        for (j in i+1 until list.size) {
            val distance = getDistance(list[i], list[j])
            if (distance < min || min == 0.0) {
                min = distance
                c1 = list[i]
                c2 = list[j]
            }
        }
    }
    return listOf(c1, c2)
}

fun main() {
    val list = listOf(Pair(1,1), Pair(3,4), Pair(6,1), Pair(-1,-6), Pair(-4,-3), Pair(-1,-1))
    val result = findShortestWay(list)
    println(result)
}