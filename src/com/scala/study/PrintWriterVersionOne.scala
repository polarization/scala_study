package com.scala.study
import java.io.File
import java.io.PrintWriter
import java.util.Date

object PrintWriterVersionOne extends App {

  def withPrintWriter(file: File, op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  withPrintWriter(new File("date.txt"), writerOne => writerOne.println(new Date()))
}