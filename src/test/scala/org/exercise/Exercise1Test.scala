package org.exercise

import org.scalatest.FunSuite

//http://allaboutscala.com/tutorials/scala-exercises-solutions/

class Exercise1Test extends FunSuite {
  test("Reverse, and then format to upper case, the given string") {
    val strToFormat = "http://allaboutscala.com/scala-exercises"
    val result = ""
    assert(result == "SESICREXE-ALACS/MOC.ALACSTUOBALLA//:PTTH")
  }

  test("Output the following basic JSON notation") {
    val donutName = "Vanilla Donut"
    val quantityPurchased = 10
    val price = 2.50
    val result = ""
    assert(result == "{\n\"donut_name\":\"Vanilla Donut\",\n\"quantity_purchased\":\"10\",\n\"price\":2.5\n}")
  }

  test("Find the 8th character in the string") {
    val string = "http://allaboutscala.com/scala-exercises"
    val result = "null"
    assert(result == 'a')
  }

  test("Reverse by alphabet order") {
    /**
     * Bill is 9 years old, Jonny is 8 years old, Tommy is 11 years old, and Cindy is 13 years old.
     * Sort out the corresponding child to age in reverse alphabet order.
     */
    val result = ""
    assert(result == "Tommy -> 11, Jonny -> 8, Cindy -> 13, Bill -> 9")
  }

  test("Find common items") {
    val setBasketOne = Set("Cake", "Milk", "Cheese", "Toilet Paper")
    val setBasketTwo = Set("Bread", "Water", "Juice", "Milk", "Cheese")
    val result = null

    assert(result == Set("Milk", "Cheese"))
  }

  test("Use the Tuple type and get list of shirt type") {
    /**
     * "T-Shirt", "Medium", 10.99
       "Polo-Shirt", "Large", 4.99
       "Vest", "Small", 5.99
       "T-Shirt", "Small", 4.99
       "T-Shirt", "Small", 4.99
     */
    val result = null
    assert(result == Set("T-Shirt", "polo-shirt", "Vest"))
  }

}
