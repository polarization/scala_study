package com.scala.study
import java.io.File
import java.io.FileReader

import scala.io.Source

object ControlTest extends App {
  val firstArg = if (!args.isEmpty) args(0) else "default"

  println(firstArg)
  for (i <- 1 to 4) {
    println(i)
  }
  for (i <- 1 to 12 if i % 2 == 0; if i % 3 == 0) {
    println(i)
  }
  val filesHere = (new File("./src/com/scala/study")).listFiles

  filesHere.foreach(file => println(file.getName()))

  def fileLines(file: File) = {
    Source.fromFile(file).getLines.toList
  }

  val forLineLengths = for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
  } yield {
    trimmed.length
  }
  forLineLengths.foreach(i => println(i))

  val friend = firstArg match {
    case "salt" => "pepper"
    case "eggs" => "bacon"
    case _ => "huh?"
  }
  println(friend)

  val f = new FileReader("input.txt")
  try {
    f.read()
  } catch {
    case t => t.printStackTrace()
  } finally {
    f.close()
  }

}