object IncreasingOrderSearhTree {
  def canMakeArithmeticProgression(arr: Array[Int]): Boolean = {
    val b = arr.sorted
    var is = true
    for (i <- 2 until b.length) {
      if (b(i) - b(i - 1) != b(i - 1) - b(i - 2)) {
        is = false
      }
    }
    is
  }

  def main(args: Array[String]): Unit = {
    println(canMakeArithmeticProgression(Array(3,5,1)))
  }
}
