package com.scala.study.traittest
import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {

  private val buf = new ArrayBuffer[Int]()

  def get(): Int = { buf.remove(0) }

  def put(x: Int): Unit = { buf += x }

  def printSelf = {
    buf.foreach(x => println(x))
  }

}