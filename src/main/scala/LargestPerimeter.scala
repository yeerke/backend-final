object LargestPerimeter {
  def largestPerimeter(nums: Array[Int]): Int = {
    var ans = -1
    val a = nums.sorted
    for (i <- a.length - 1 until 1 by -1) {
      if (a(i) < a(i - 1) + a(i - 2) && ans == -1) {
        ans = a(i) + a(i - 1) + a(i - 2)
      }
    }
    if (ans == -1) ans = 0
    ans
  }
}
