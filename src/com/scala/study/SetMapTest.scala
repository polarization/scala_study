package com.scala.study
import scala.collection.immutable.HashSet

object SetMapTest extends App {

  def printSet(set: Set[String]): Unit = {
    set.foreach(item => println(item))
  }

  val movieSet = Set("ass", "leg")
  printSet(movieSet + "foot")
  val hashSet = HashSet("ass", "leg")
  val treasureMap = Map[Int, String]()
  treasureMap + (1 -> "Go to island")
}