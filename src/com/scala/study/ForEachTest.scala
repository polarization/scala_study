package com.scala.study

object ForEachTest extends App {

  println("*************normal one*************")
  args.foreach(arg => println(arg))
  println("*************formal one*************")
  args.foreach((arg: String) => println(arg))
  println("*************consice one*************")
  args.foreach(println)
  println("*************for expression*************")
  for (arg <- args) {
    //each arg here is val but not var
    println(arg)
  }
}