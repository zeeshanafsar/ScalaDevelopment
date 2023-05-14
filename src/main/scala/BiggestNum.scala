object BiggestNum {
  def main(args: Array[String]): Unit = {
    val a = 5
    val b = 6
    val c = 7
    if(a>b && a>c){
      println(a + " is the biggest number")
    }
    else if(b>a && b>c){
      println(b + " is the biggest num")
    }
    else{
      println(c + " is the gratest number")
    }
  }

}
