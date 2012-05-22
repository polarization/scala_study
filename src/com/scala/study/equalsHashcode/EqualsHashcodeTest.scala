package com.scala.study.equalsHashcode
import scala.collection.immutable.HashSet

object EqualsHashcodeTest extends App {
  class Point(val x: Int, val y: Int) {
    override def hashCode = 41 * (41 + x) + y
    override def equals(other: Any) = {
      other match {
        case that: Point => this.x == that.x && this.y == that.y
        case _ => false
      }
    }
  }
  val p1, p2 = new Point(1, 2)
  println(List(p1) contains p2)
  println(HashSet(p1) contains p2)
}