case object Sum{
  def main(args: Array[String]): Unit = {
    var sum = 0
    for(x <- 53 until 154){
      sum = sum+x
    }
    println(sum)
  }
}
