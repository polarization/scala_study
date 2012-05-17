package com.scala.study.recipe

class Recipe(val name: String, val instructions: String, val ingredients: List[Food]) {
  override def toString = name
}