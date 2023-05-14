case object FindEven{
  def main(args: Array[String]): Unit = {
    for (x <- 700 to 900) {
      if (x % 2 == 0) {
        print(x + " ")
      }
      }
    }
}
