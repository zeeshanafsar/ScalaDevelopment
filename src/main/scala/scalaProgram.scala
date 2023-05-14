object scalaProgram {
  def main(args: Array[String]): Unit ={
    import scala.io.StdIn
     println("Enter the number")
    var x = StdIn.readInt()
    if(x>=100 && x<=1000) {
      if (x % 2 == 0) {
        val rem = x%3
        println("Reminder is",rem)
      }
      else {
        val rem2 = x%2
        println("Reminder is ",rem2)
      }
    }
    else{
      println("wrong number")
    }
  }
  }


