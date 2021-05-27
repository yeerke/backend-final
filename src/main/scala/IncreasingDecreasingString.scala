object IncreasingDecreasingString {
  def sortString(s: String): String = {
    val target = new StringBuilder
    val freq = new Array[Int](26)
    for (i <- 0 until s.length) {
      val value = s.charAt(i) - 'a'
      freq(value) += 1
    }
    while ( {
      target.length < s.length
    }) {
      for (j <- 0 until freq.length) {
        if (freq(j) > 0) {
          target.append((j + 'a').toChar)
          freq(j) -= 1
        }
      }
      for (j <- freq.length - 1 to 0 by -1) {
        if (freq(j) > 0) {
          target.append((j + 'a').toChar)
          freq(j) -= 1
        }
      }
    }
    target.toString
  }
}
