package com.scala.study.enumeration

object EnumApp extends App {

  object Direction extends Enumeration {
    val N = Value("North")
    val E = Value("East")
    val S = Value("South")
    val W = Value("West")
  }

  for (d <- Direction.values) {
    println(d)
  }
}