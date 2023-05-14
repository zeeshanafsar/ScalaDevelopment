
object SqrtArray {
  def main(args: Array[String]): Unit= {
    println("Enter size of array")
    var size = scala.io.StdIn.readInt
    var a = new Array[Int](size)
    var temp=0
    for (i <- 0 until size) {
      var sqrt = i/2
      do{
        temp=sqrt
        sqrt = (temp+(i/temp))/2

      }while(sqrt-temp!=0)
      println(i)


    }
  }

}
