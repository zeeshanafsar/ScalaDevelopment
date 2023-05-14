object countEven {
  def main(args: Array[String]): Unit = {
    var a: Int = 0
    var b: Int = 0
    println("Enter first number")
    a = scala.io.StdIn.readInt

    println("Enter last number")
    b = scala.io.StdIn.readInt
    var count = 0

    for (x <- a to b) {
      if (x % 2 == 0) {
        count += 1
      }
    }
    print("even count is: "+count)
  }
}
