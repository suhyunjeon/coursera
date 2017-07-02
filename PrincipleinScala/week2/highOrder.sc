object highOrder {

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a+1, b)

  def sumInts(a: Int, b: Int) = sum(id, a, b)
  def sumCubes(a: Int, b: Int) = sum(cube, a, b)
  def sumFactorials(a: Int, b: Int) = sum(fact, a, b)

  def id(x: Int): Int = x
  def cube(x: Int): Int = x * x * x
  def fact(x: Int): Int = if (x==0) 1 else fact(x-1)

  sumInts(1, 3)

  def sum(f: Int => Int, a: Int, b: Int) = {
    def loop(a: Int, acc: Int): Int =
      printf(s"${a}, ${b}, ${acc}")
      if (a > b) acc
      else loop(a + 1, f(a) + acc)

    loop(a, 0)
  }

  sum(x => x + x, 1, 3)





}