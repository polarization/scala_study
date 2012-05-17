package com.scala.study.recipe

object RecipeApp extends App {
  object Apple extends Food("Apple")
  object Orange extends Food("Orange")
  object Cream extends Food("Cream")
  object Suger extends Food("Suger")
  object FruitSalad extends Recipe("fruit salad", "vegetable", List(Apple, Orange, Cream, Suger))
  object SimpleDatabase {
    def allFoods = List(Apple, Orange, Cream, Suger)
    def allRecipes = List(FruitSalad)
    def findFoodByName(name: String) = {
      allFoods.find(p => p.name == name)
    }
  }
  object SimpleBrowser {
    def recipesUsing(food: Food) = {
      SimpleDatabase.allRecipes.filter(recipe => recipe.ingredients.contains(food))
    }
  }
}