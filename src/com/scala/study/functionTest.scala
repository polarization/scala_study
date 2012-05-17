package com.scala.study

object functionTest extends App {

  var increase = (x: Int) => {
    println("Hello World!")
    x + 1
  }

  println(increase(10))

  val someNumbers = List(-1, 3, -4, 5, 0)
  someNumbers.filter(_ > 0).foreach(println _)

  val func = (_: Int) + (_: Int)
  println(func(5, 10))

  def sum(a: Int, b: Int, c: Int) = {
    a + b + c
  }

  val a = sum _
  val b = sum(1, _: Int, 3)
  println(a(1, 2, 3))
  println(b(5))

  def echo(args: String*) = {
    args.foreach(println)
  }
  echo("Hello", "World")
  val arr = Array("what's", "up", "doc?")
  echo(arr: _*)

  def curriedSum(x: Int)(y: Int) = x + y
  println(curriedSum(1)(2))

  val onePlus = curriedSum(1)_
  println(onePlus(2))

  def twice(op: Double => Double, x: Double) = op(op(x))

  println(twice(_ + 1, 5))

  var flag = true
  def myAssert(op: => Boolean) = {
    if (flag && !op) {
      throw new AssertionError
    }
  }

  myAssert(5 > 3)
}