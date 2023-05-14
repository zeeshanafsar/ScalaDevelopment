object PrintEvenArr {
  def main(args: Array[String]): Unit = {
    println("Enter size of array")
    var size = scala.io.StdIn.readInt
    var array = new Array[Int](size)
    for (i <- 0 until size) {
      if(i%2==0) {
        println(i)
      }
    }
  }

}
