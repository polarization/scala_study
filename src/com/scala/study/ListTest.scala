package com.scala.study

object ListTest extends App {

  def printList(list: List[String]): Unit = {
    list.foreach(item => println(item))
  }

  val listOne = "one" :: "two" :: "three" :: Nil
  printList(listOne)
  printList(listOne ::: List("four", "five"))
  println(listOne(2))
  println(listOne.count(s => s.length == 3))
  printList(listOne.drop(2))
  printList(listOne.dropRight(2))
  println(listOne.exists(s => s == "two"))
  printList(listOne.filter(s => s.length == 3))
  println(listOne.forall(s => s.endsWith("e")))
  printList(listOne.init)
  println(listOne.length)
  printList(listOne.map(s => s + "911"))
  println(listOne.mkString(", "))
  printList(listOne.remove(s => s.length == 3))
  printList(listOne.reverse)
  printList(listOne.tail)
  printList(listOne.sort((s, t) => s.charAt(1).toLowerCase < t.charAt(1).toLowerCase))
}