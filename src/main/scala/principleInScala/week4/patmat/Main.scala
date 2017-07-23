package principleInScala.week4.patmat

import principleInScala.week4.patmat.Huffman.{Fork, Leaf}
import principleInScala.week4.patmat.Huffman._

/**
  * @author tasha.jeon
  * @since 2017. 7. 23. 
  */
object Main extends App {
  trait TestTrees {
    val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
    val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
  }

  new TestTrees {
    weight(t1) == 5
  }

  new TestTrees {
    chars(t2) == List('a','b','d')
  }

  string2Chars("hello, world") == List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd')

  makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) == List(Leaf('e',1), Leaf('t',2), Leaf('x',3))


  val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
  combine(leaflist) == List(Fork(Leaf('e',1),Leaf('t',2),List('e', 't'),3), Leaf('x',4))


  new TestTrees {
    decode(t1, encode(t1)("ab".toList)) == "ab".toList
  }
}