package com.scala.study.abstractInstance

object AbstractTypeTest extends App {

  class Food
  abstract class Animal {
    type SuitableFood <: Food
    def eat(food: SuitableFood)
  }

  class Grass extends Food
  class Fish extends Food
  class Cow extends Animal {
    type SuitableFood = Grass
    override def eat(food: Grass) = {

    }
  }

  val cow = new Cow
  cow.eat(new cow.SuitableFood)

  class Outer {
    class Inner
  }

  val o1 = new Outer
  val o2 = new Outer

  val i1 = new o1.Inner
  val i2 = new o2.Inner
  
  println(i1)
  println(i2)
}