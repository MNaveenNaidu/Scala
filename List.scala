package week4

trait List[T] {
def isEmpty:Boolean
def head:T
def tail:List[T]
}

class Cons[T](val head:T,val tail:List[T]) extends List[T]
{
def isEmpty = false
}

class Nill[T] extends List[T]{
  def isEmpty:Boolean =  true
  def head:Nothing = throw new NoSuchElementException("head.nill")
  def tail:Nothing = throw new NoSuchElementException("tail.nill")
}