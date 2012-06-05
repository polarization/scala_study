package com.scala.study.actors
import scala.actors.Actor
import scala.actors.Actor._

object ActorTest extends App {
  object SillyActor extends Actor {
    def act {
      for (i <- 1 to 5) {
        println("I am acting!")
        Thread.sleep(1000);
      }
    }
  }
  object SeriousActor extends Actor {
    def act {
      for (i <- 1 to 5) {
        println("To be or not to be.")
        Thread.sleep(1000);
      }
    }
  }
  SillyActor.start()
  SeriousActor.start()
  val seriousActor2 = Actor.actor {
    for (i <- 1 to 5) {
      println("That is the question.")
      Thread.sleep(1000);
    }
  }
  val echoActor = actor {
    while (true) {
      receive {
        case msg => println("received message: " + msg)
      }
    }
  }
  echoActor ! "Hi There!"
}