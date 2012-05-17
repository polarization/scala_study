package com.scala.study

object SymbolTest extends App {

  def printSet(set: Set[String]): Unit = {
    set.foreach(item => println(item))
  }

  val itemMap = Map[String, Any]("key" -> "value")
  def updateItemByName(itemName: Symbol, itemValue: Any): Map[String, Any] = {
    itemMap + (itemName.toString() -> itemValue)
  }
  printSet(updateItemByName('anyKey, "value").keySet)
  //use tuple to iterate map
  updateItemByName('anyKey, "value").foreach((e) => println("key: " + e._1 + " value: " + e._2))
  //use case to iterate map
  updateItemByName('anyKey, "value").foreach { case (key, value) => println("key: " + key + " value: " + value) }
  //use for to iterate map
  for ((key, value) <- updateItemByName('anyKey, "value")) {
    println("name: " + key + " score: " + value)
  }
}