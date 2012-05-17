package com.scala.study.traittest

trait Doubling extends IntQueue {

  abstract override def put(x: Int) = { super.put(2 * x) }
}