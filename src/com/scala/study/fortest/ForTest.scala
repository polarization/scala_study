package com.scala.study.fortest

object ForTest extends App {

  case class Person(name: String, isMale: Boolean, children: Person*)
  val lara = new Person("lara", false)
  val bob = new Person("Bob", true)
  val julie = new Person("Julie", false, lara, bob)
  val persons = List(lara, bob, julie)
  val list = persons.filter(p => !p.isMale).flatMap(p => p.children.map(c => (p.name, c.name)))
  list.foreach(p => println(p._1 + " is " + p._2 + "'s mother."))

  for (p <- persons; if !p.isMale; c <- p.children)
    yield (p.name, c.name)
}