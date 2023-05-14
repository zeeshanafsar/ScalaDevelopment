object Temperature {
  def main(args: Array[String]): Unit = {
    import scala.io.StdIn
    val c = 80
    val f = (c * 9 / 5) + 32
    println("Temperature in Fahrenheit:", f)


    //dynamically
    println("Enter temperature in celcius")
    var n = StdIn.readInt()
    var t = ((n * 9 / 5) + 32)
    println("Temperature in fahrenheit", t)
  }

}
