/*trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def prepend[U >: T](elem: U): List[U] = new Cons(elem, this)
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

object Nil extends List[Nothing] {
  def isEmpty: Boolean = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: List[Nothing] = throw new NoSuchElementException("Nil.tail")
}

object test {
  val x: List[String] = Nil
  def f(xs: List[NonEmpty], x: Empty) = xs prepend x
}*/


List(1,2) :: List(3,4)

def insert(x: Int, xs: List[Int]): List[Int] =
  xs match {
    case List() => List(x)
    case y :: ys =>
      if (x <= y) x :: xs
      else y :: insert(x, ys)
  }

insert(1, List(2,3))

def insert2(x: Int, xs: List[Int]): List[Int] =
  xs match {
    case List() => List(x)
    case y :: ys =>
      if (x <= y) x :: xs
      else y :: insert(x, ys)

  }

insert2(4, List(2,5))

def isort(xs: List[Int]): List[Int] = {
  xs match {
    case List() => List()
    case x :: xs1 => insert(x, isort(xs1))
  }
}

isort(List(1, 6, 4, -2, 5, 12))
