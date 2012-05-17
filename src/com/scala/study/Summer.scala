package com.scala.study
import ChecksumAccumulator.calculate

object Summer {

  def main(args: Array[String]): Unit = {
    args.foreach(s => println(calculate(s)))
  }

}