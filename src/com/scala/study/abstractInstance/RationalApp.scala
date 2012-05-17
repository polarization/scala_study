package com.scala.study.abstractInstance

object RationalApp extends App {
  new {
    val numerArg = 1
    val denomArg = 2
  } with RationalTrait

  object twoThird extends {
    val numerArg = 2
    val denomArg = 3
  } with RationalTrait

  class Test {
    val numerArg = 10
  }

  new {
    val numerArg = 1
    val denomArg = this.twoThird.denomArg
  } with RationalTrait

  class RationalClass(n: Int, d: Int) extends {
    val numerArg = n
    val denomArg = d
  } with RationalTrait {

  }
  
  object Demo{
    lazy val x = {
      println("initialize x")
      "done"
    }
  }
}