package com.scala.study.recipe

object RecipeApp extends App {
  object Apple extends Food("Apple")
  object Orange extends Food("Orange")
  object Cream extends Food("Cream")
  object Suger extends Food("Suger")
  object FruitSalad extends Recipe("fruit salad", "vegetable", List(Apple, Orange, Cream, Suger))
  trait SimpleFood {
    object Pear extends Food("Pear")
    def allFoods = List(Apple, Pear)
    def allCategories = Nil
  }
  trait SimpleRecipes {
    this: SimpleFood =>
    object SimpleFruitSalad extends Recipe("simple fruit salad", "vegetable", List(Apple, Pear))
    def allRecipes = List(SimpleFruitSalad)
  }
  object SimpleDatabase extends Database with SimpleFood with SimpleRecipes
  object SimpleBrowser extends Browser {
    val database = SimpleDatabase
  }
}