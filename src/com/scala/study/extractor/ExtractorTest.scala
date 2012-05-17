package com.scala.study.extractor

object ExtractorTest extends App {

  object Email {
    def apply(user: String, domain: String) = user + "@" + domain
    def unapply(str: String): Option[(String, String)] = {
      val parts = str.split("@")
      if (parts.length == 2)
        Some(parts(0), parts(1))
      else None
    }
  }

  def judgeEmail(str: String) = {
    str match {
      case Email(user, domain) => println(str + " is an email address")
      case _ => println(str + " is not an email address")
    }
  }

  judgeEmail("demo@demo.com")
  judgeEmail("china usa")
}