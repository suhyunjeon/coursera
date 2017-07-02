object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  val s1 = singletonSet(1)
  val s2 = singletonSet(2)
  val s3 = singletonSet(3)
  val s4 = union(s1, s2)
  val s5 = union(s2, s3)
  val s6 = diff(s4, s1)
  val s7 = intersect(s4, s5)

  // singleton
  printSet(s1)
  printSet(s2)
  printSet(s3)

  // union
  printSet(s4)
  printSet(s5)

  // diff
  printSet(s6)

  // intersect
  printSet(s7)

  // filter
  val s8 = union(s4, s5)
  printSet(filter(s8, x => x > 1))
  printSet(filter(s8, x => x % 2 == 1))

  def s11:Set = x => x >= 2 && x <= 4
  printSet(s11)

  // forall
  println(forall(s11, x => x < 4))
  println(forall(s11, x => x < 5))

  // exists
  println(exists(s11, x => x == 3))
  println(exists(s11, x => x == 1))

  // map
  printSet(map(s8, x => x * x))
  printSet(map(s11, x => x / 2))
}
