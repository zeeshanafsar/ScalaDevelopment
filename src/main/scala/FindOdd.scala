case object FindOdd{
  def main(args: Array[String]): Unit = {
    for (x <- (51 to 251).reverse) {
      if (x % 2 != 0) {
        print(x + " ")
      }
    }
  }
}
