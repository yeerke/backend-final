object MaximumUnitsOnTruck {

  def maximumUnits(boxTypes: Array[Array[Int]], truckSize: Int): Int = {
    var res: Int = 0
    var b = boxTypes.sortWith(_ (1) < _ (1))
    b = b.reverse
    var t = truckSize
    b foreach { row => row foreach print; println }

    var i = 0
    while ( {
      t > 0 && i < b.length
    }) {
      val box_no: Int = b(i)(0).min(t)
      res += box_no * b(i)(1)
      i += 1
      t -= box_no
    }
    res
  }

  def main(args: Array[String]): Unit = {
    println(maximumUnits(Array(Array(5, 10), Array(2, 5), Array(4, 7), Array(3, 9)), 10))
  }
}
