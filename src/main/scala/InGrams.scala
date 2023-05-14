object InGrams {
  def main(args: Array[String]): Unit= {
    import scala.io.StdIn
    val weight: Int = 56
    val res = weight * 1000
    println("Weight in grams:" + res + "grams")

    // Dynamically
    println("Enter the weight in kilograms")
    var n = StdIn.readInt()
    n = n*1000
    println("Weight in grams:",n);

  }

}
