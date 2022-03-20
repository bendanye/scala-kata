package org.exercise

import org.scalatest.FunSuite

import org.exercise.NumberExercise.sum
import org.exercise.NumberExercise.is30
import org.exercise.NumberExercise.isMultipleOf3Or7


//https://www.w3resource.com/scala-exercises/basic/

class NumberExerciseTest extends FunSuite {

  /*
    Write a method to compute the sum of the two given integer values.
    If the two values are the same, then return triples their sum.
   */
  test("1 + 2 = 3") {
    assert(3 == sum(1, 2))
  }

  test("1 + 1 = 2 * 3") {
    assert(6 == sum(1, 1))
  }

  /*
  Write a method to check two given integers, and return true if one of them is 30 or if their sum is 30
  */

  test("true when x is 30") {
    assert(true == is30(30, 15))
  }

  test("true when y is 30") {
    assert(true == is30(15, 30))
  }

  test("false when sum of 2 not equal to 30") {
    assert(false == is30(14, 15))
  }

  test("true when sum of 2 equal to 30") {
    assert(true == is30(15, 15))
  }

  /*
    Write a Scala program to check whether a given positive number is a multiple of 3 or a multiple of 7
   */

  test("true when is multiple of 3") {
    assert(isMultipleOf3Or7(3) == true)
  }

  test("true when is multiple of 7") {
    assert(isMultipleOf3Or7(7) == true)
  }

  test("false when is not multiple of 3 and 7") {
    assert(isMultipleOf3Or7(4) == false)
  }

}

