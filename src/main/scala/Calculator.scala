object Calculator {

    var ch: Char =0
    var x: Int = 0
    var y: Int = 0
    var res: Int = 0

    println("Choose Operation to perform(+,-,*,/): ")
    ch= scala.io.StdIn.readChar()

    println("Enter first number:")
    x= scala.io.StdIn.readInt()

    println("Enter 2nd number:")
    y = scala.io.StdIn.readInt()

    ch match{
      case '+' => res=x+y
      case '-' => res=x-y
      case '*' => res=x*y
      case '/' => res=x/y
      case _   => print("invalid input")
    }
    println("Result: "+res)


}
