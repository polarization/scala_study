package com.scala.study.implicittest
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

import javax.swing.JButton

object FirstTest extends App {

  implicit def function2ActionListener(f: ActionEvent => Unit) =
    new ActionListener {
      def actionPerformed(event: ActionEvent) = f(event)
    }

  val button = new JButton
  button.addActionListener(
    (_: ActionEvent) => println("pressed"))
}