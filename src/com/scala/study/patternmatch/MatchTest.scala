package com.scala.study.patternmatch

object MatchTest extends App {

  abstract class Expr
  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

  def simplifyTop(expr: Expr): Expr = {
    expr match {
      case UnOp("-", UnOp("-", e)) => e
      case BinOp("+", e, Number(0)) => e
      case BinOp("*", e, Number(1)) => e
      case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
      case _ => expr
    }
  }

  val expr = ""
  def testMatch(expr: Any) = expr match {
    case 5 => "five"
    case List(0, _, _) => "list with size=3 and start with 0"
    case List(0, _*) => "list start with 0"
    case (a, b, c) => "matched" + a + b + c
    case s: String => s.length
    case m: Map[_, _] => m.size
    case sth => "sth else" + sth
  }
}