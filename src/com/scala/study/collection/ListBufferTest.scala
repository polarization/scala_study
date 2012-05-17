package com.scala.study.collection
import scala.collection.mutable.ListBuffer

object ListBufferTest extends App {

  val buf = new ListBuffer[Int]()
  buf += 1
  buf += 2
  3 +: buf
}