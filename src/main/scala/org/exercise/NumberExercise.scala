package org.exercise

object NumberExercise {

  def sum(x: Int, y: Int): Int = {
    if (x == y) (x + y) * 3 else x + y
  }

  def is30(x: Int, y: Int): Boolean = {
    x == 30 || y == 30 || x + y == 30
  }

  def isMultipleOf3Or7(value: Int): Boolean = {
    value % 3 == 0 || value % 7 == 0
  }
}
