package com.scala.study.queue

trait Queue[+T] {
  def head: T
  def tail: Queue[T]
  def append[U >: T](x: U): Queue[U]
}

object Queue {
  //def apply[T](xs: T*) = new QueueImpl[T](xs.toList, Nil)

//  private class QueueImpl[T] private (
//    private val leading: List[T],
//    private val trailing: List[T]) extends Queue[T] {
//
//    private def mirror = {
//      if (leading.isEmpty) {
//        new QueueImpl(trailing.reverse, Nil)
//      } else {
//        this
//      }
//    }
//
//    def head = {
//      mirror.leading.head
//    }
//
//    def tail = {
//      val q = mirror
//      new QueueImpl(q.leading.tail, q.trailing)
//    }
//
//    def append[U >: T](x: U) = {
//      new QueueImpl(leading, x :: trailing)
//    }
//  }
}

