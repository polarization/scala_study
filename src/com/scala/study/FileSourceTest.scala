package com.scala.study
import scala.io.Source

object FileSourceTest extends App {

  def widthOfLength(s: String) = s.length.toString.length

  val lines = Source.fromFile("/home/leizhang/test").getLines.toList
  //var maxWidth = 0
  //lines.foreach(line => maxWidth = maxWidth.max(widthOfLength(line)))
  val longestLine = lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
  val maxWidth = widthOfLength(longestLine)

  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
}