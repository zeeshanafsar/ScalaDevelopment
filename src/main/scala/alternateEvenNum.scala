object alternateEvenNum {
  def main(args: Array[String]): Unit = {
   var y=16
    for (x <- 20 to 140) {
      if (x % 2 == 0) {
        if(y<x) {
          y += 4
          println(y)
        }
      }
    }
  }
}
