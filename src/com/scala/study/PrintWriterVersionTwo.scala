package com.scala.study
import java.io.File
import java.io.PrintWriter
import java.util.Date

object PrintWriterVersionTwo extends App {
  def withPrintWriter(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  val file = new File("date.txt")

  withPrintWriter(file) {
    writerOne => writerOne.println(new Date())
  }
}