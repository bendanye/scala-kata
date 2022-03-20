package org.exercise

import org.scalatest.FunSuite

// http://allaboutscala.com/tutorials/chapter-8-beginner-tutorial-using-scala-collection-functions/scala-foldleft-example/

class FoldLeftExerciseTest extends FunSuite {
  test("Sum of prices should match") {
    val prices: Seq[Double] = Seq(1.5, 2.0, 2.5)
    val result = 0.0
    assert(result == 6.0)
  }

  test("Name of donuts should match") {
    val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")
    val result = ""
    assert(result == "Plain Donut Strawberry Donut Glazed Donut ")
  }

  test("using value function") {
    val donuts: Seq[String] = Seq("Plain", "Strawberry", "Glazed")

    // Use value function to init concatDonuts and foldLeft uses it
    val concatDonuts = null
    val result = ""

    assert(result == "Plain Donut Strawberry Donut Glazed Donut ")
  }



}
