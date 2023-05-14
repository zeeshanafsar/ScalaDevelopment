object rangeProgram {
  def main(args: Array[String]): Unit = {
    val a: Int = 86;
    if (a > 90 && a <= 100) {
      println("Super Smart")
    }
    else if (a > 80 && a <= 90) {
      println("Smart")
    }
    else if (a > 70 && a <= 80) {
      println("Smart enough")
    }
    else if (a > 60 && a <= 70) {
      println("just Smart")
    }
    else if (a > 35 && a <= 60) {
      println("no smart")
    }
    else if (a >= 0 && a <= 35) {
      println("dump")
    }
    else {
      println("Invalid input")
    }
  }
}
