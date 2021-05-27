object ValidAnagram {
  def isAnagram(s: String, t: String): Boolean = {
    val a = Array.ofDim[Int](26)
    for (c <- s) {
      a(c - 'a') += 1
    }
    val b = Array.ofDim[Int](26)
    for (c <- t) {
      b(c - 'a') += 1
    }
    var is = true
    for (i <- 0 to 25) {
      if (a(i) != b(i)) {
        is = false
      }
    }
    is
  }

  def main(args: Array[String]): Unit = {
    print(isAnagram("asdf", "fdsa"))
  }
}
