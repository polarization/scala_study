package com.scala.study.recipe

abstract class Database extends FoodCategories {
  def allFoods: List[Food]
  def allRecipes: List[Recipe]
  def findFoodByName(name: String) = {
    allFoods.find(f => f.name == name)
  }
}