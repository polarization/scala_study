package com.scala.study.implicittest

object ImplicitParameter extends App {

  class PreferredPromt(val preference: String)

  object Greeter {
    def greet(name: String)(implicit prompt: PreferredPromt) {
      println("Welcome, " + name)
      println(prompt.preference)
    }
  }

  val tempPrompt = new PreferredPromt("relax>")
  Greeter.greet("Lei")(tempPrompt)

  object MyPref {
    implicit val myPrompt = new PreferredPromt("task>")
  }

  import MyPref._
  Greeter.greet("Lei")
  Greeter.greet("Lei")(myPrompt)

  def maxListUpBound[T](elements: List[T])(implicit orderer: T => Ordered[T]): T = {
    elements match {
      case List() => throw new Exception
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListUpBound(rest)(orderer)
        if (orderer(x) > maxRest) x
        else maxRest
    }
  }
  println(maxListUpBound(List(2, 5, 3)))
}