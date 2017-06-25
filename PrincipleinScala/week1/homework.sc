
/**
  * Exercise 1
  */
def pascal(c: Int, r: Int): Int =
  c match {
    case 0 => 1
    case c if c == r => 1
    case _ => pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

/**
  * Exercise 2
  */
def balance(chars: List[Char]): Boolean = {
  def isVerify(chars: List[Char], count: Int): Boolean = {
    chars.isEmpty match {
      case true => count == 0
      case _ =>
        chars.head match {
          case '(' => isVerify(chars.tail, count + 1)
          case ')' => count > 0 && isVerify(chars.tail, count - 1)
          case _ => isVerify(chars.tail, count)
        }
    }
  }
  isVerify(chars, 0)
}

/**
  * Exercise 3
  */
def countChange(money: Int, coins: List[Int]): Int =
  money match {
    case 0 => 1
    case x if x < 0 => 0
    case x if x >= 1 && coins.isEmpty => 0
    case _ => countChange(money, coins.tail) + countChange(money - coins.head, coins)

  }

println("Pascal's Triangle")
for (row <- 0 to 5) {
  for (col <- 0 to row) {
    print(pascal(col, row) + " ")
  }
  println()
}

println("Parentheses Balancing")
println("(if (zero? x) max (/ 1 x))' is balanced")
println("I told him (that it's not (yet) done).\n(But he wasn't listening)".toList)
println(":-)".toList)
println("())(".toList)

println("Counting Change")

println(countChange(4,List(1,2)) == 3)
println(countChange(300,List(5,10,20,50,100,200,500)) == 1022)
println(countChange(301,List(5,10,20,50,100,200,500)) == 0)
println(countChange(300,List(500,5,50,100,20,200,10)) == 1022)



