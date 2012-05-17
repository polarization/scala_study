package com.scala.study

object ArrayTest extends App {

  val greeting = new Array[String](3)
  greeting(0) = "Hello"
  greeting(1) = ","
  greeting(2) = "World!\n"
  //use array's foreach
  greeting.foreach(arg => print(arg))
  //use for
  //notice 0 to 2 is (0).to(2)
  for (i <- 0 to 2) {
    print(greeting(i))
  }

  val numNames = Array("zero", "one", "two")

}