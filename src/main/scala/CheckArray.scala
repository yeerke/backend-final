import scala.collection.mutable

object CheckArray {
  def canFormArray(arr: Array[Int], pieces: Array[Array[Int]]): Boolean = {
    val m = mutable.HashMap[Int, Int]()
    var i = 0
    while ( {
      i < pieces.length
    }) {
      m.put(pieces(i)(0), i)

      i += 1
    }
    i = 0
    while ( {
      i < arr.length
    }) {
      if (!m.contains(arr(i))) return false
      else {
        var j = 0
        val tmp = pieces(m(arr(i)))
        while ( {
          i < arr.length && j < tmp.length
        }) {
          if (arr(i) != tmp(j)) return false
          i += 1
          j += 1
        }
      }
    }
    true
  }

  def main(args: Array[String]): Unit = {
    println(canFormArray(Array(85), Array(Array(85))))
  }

}
