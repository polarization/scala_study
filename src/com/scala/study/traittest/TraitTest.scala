package com.scala.study.traittest

object TraitTest extends App {

  val queue = new BasicIntQueue with Doubling with Incrementing with Filtering
  queue.put(1)
  queue.put(-1)
  queue.printSelf
}