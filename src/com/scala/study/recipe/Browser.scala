package com.scala.study.recipe

abstract class Browser {
  val database: Database
  def recipesUsing(food: Food) = {
    database.allRecipes.filter(recipe => recipe.ingredients.contains(food))
  }
  def displayCategory(category: database.FoodCategory) = {
    println(category)
  }
}