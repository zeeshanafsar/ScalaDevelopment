object IsDivisible {
  def main(args: Array[String]): Unit = {
    for(x <- 250 until 551 ) {
      if(x%11==0){
        print(x + " ")
      }
    }
  }
}
