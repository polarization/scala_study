package com.scala.study.list

object AdvanceListTest extends App {

  def isort(xs: List[Int]): List[Int] = {
    if (xs.isEmpty) Nil
    else insert(xs.head, isort(xs.tail))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = {
    if (xs.isEmpty || x <= xs.head) x :: xs
    else xs.head :: insert(x, xs.tail)
  }

  def isortMatch(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case x :: xs1 => insertMatch(x, isort(xs1))
  }

  def insertMatch(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys1 => if (x <= y) x :: xs
    else y :: insertMatch(x, ys1)
  }

  def append[T](xs: List[T], ys: List[T]): List[T] = {
    xs match {
      case List() => ys
      case x :: xs1 => x :: append(xs1, ys)
    }
  }

  def rev[T](xs: List[T]): List[T] = {
    xs match {
      case List() => xs
      case x :: xs1 => rev(xs1) ::: List(x)
    }
  }

  def sum(xs: List[Int]): Int = (0 /: xs)(_ + _)

  def product(xs: List[Int]): Int = (1 /: xs)(_ * _)

  def reverseLeft[T](xs: List[T]) = {
    (List[T]() /: xs) {
      (ys, y) => y :: ys
    }
  }
}