package com.scala.study.rational

object RationalTest extends App {
  val x = new Rational(1, 5)
  println(x)
  val y = new Rational(1, 5)
  println(x + y)
  println(x + x * y)
}