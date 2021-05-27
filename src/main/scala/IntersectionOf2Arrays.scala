object IntersectionOf2Arrays {
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val a = nums1.sorted
    val b = nums2.sorted
    var l0 = 0
    var l = 0
    var ans = Array[Int]()
    while ( {
      l0 < a.length && l < b.length
    }) {

      if (a(l0) < b(l)) {
        l0 += 1
      } else if (a(l0) > b(l)) {
        l += 1
      } else {
        val x = a(l0)
        while ( {
          l0 < a.length && l < b.length && (a(l0) == x) && (b(l) == x)
        }) {
          l0 += 1
          l += 1
        }

        ans :+= a(l0 - 1)
      }
    }
    ans
  }

  def main(args: Array[String]): Unit = {
    println(intersection(Array(1,2,2,1), Array(2, 2)).mkString(" "))
  }

}
