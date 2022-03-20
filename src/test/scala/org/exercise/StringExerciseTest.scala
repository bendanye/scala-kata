package org.exercise

import org.scalatest.FunSuite
import org.exercise.StringExercise.{addFirstThreeCharacterToFrontAndBad, addLastCharacterToFrontAndBad, addingIfString, copyString, duplicateFirstTwoCharacters, exchangeCharacter, removeCharacter, removeYtInFirstIndex, upperLast4Characters}


// https://www.w3resource.com/scala-exercises/basic/

class StringExerciseTest extends FunSuite {

  /*
    Write a method to create a new string where 'if' is added to the front of a given string.
    If the string already begins with 'if', return the string unchanged
   */
  test("new string when if is not in front") {
    assert("if i am the programmer" == addingIfString("i am the programmer"))
  }

  test("remain when if is already in front") {
    assert("if i am a bird" == addingIfString("if i am a bird"))
  }

  /*
    Write a method to remove the character in a given position of a given string.
    The given position will be in the range 0...string length -1 inclusive
   */

  test("remove first character in the string") {
    assert(removeCharacter("Scala", 0) == "cala")
  }

  test("remove last character in the string") {
    assert(removeCharacter("Scala", 4) == "Scal")
  }

  test("remove non first and last character in the string") {
    assert(removeCharacter("Scala", 1) == "Sala")
  }

  /*
    Write a method to exchange the first and last characters in a given string and return the new string.
   */
  test("same string when first and last character are the same") {
    assert(exchangeCharacter("abba") == "abba")
  }

  test("exchange first and last character") {
    assert(exchangeCharacter("abcd") == "dbca")
  }

  test("handle if there is one character string") {
    assert(exchangeCharacter("a") == "a")
  }

  /*
    Write a method to to create a new string which is 4 copies of the 2 front characters of a given string.
    If the given string length is less than 2 return the original string
   */
  test("first two char with 4 copies") {
    assert(duplicateFirstTwoCharacters("Scala") == "ScScScSc")
  }

  test("original string less than 2") {
    assert(duplicateFirstTwoCharacters("a") == "a")
  }

  /*
    Write a Scala program to create a new string with the last char added at the front and back of a given string of length 1 or more.
   */

  test("add last character to front and back") {
    assert(addLastCharacterToFrontAndBad("Scala") == "aScalaa")
  }

  test("not added if empty string") {
    assert(addLastCharacterToFrontAndBad("") == "")
  }

  /*
    Write a Scala program to create a new string taking the first 3 characters of a given string
    and return the string with the 3 characters added at both the front and back.
    If the given string length is less than 3, use whatever characters are there.
   */

  test("new string when string is 3 and more") {
    assert(addFirstThreeCharacterToFrontAndBad("Scala") == "ScaScalaSca")
  }

  test("new string when string is 2 and less") {
    assert(addFirstThreeCharacterToFrontAndBad("AB") == "ABABAB")
  }

  /*
    Write a Scala program to check whether a string 'yt' appears at index 1 in a given string.
    If it appears return a string without 'yt' otherwise return the original string
   */
  test("does not remove yt if does not exists") {
    assert(removeYtInFirstIndex("Scala") == "Scala")
  }

  test("remove yt if exists on first index") {
    assert(removeYtInFirstIndex("iytamabc") == "iamabc")
  }

  test("does not remove yt if not on the first index") {
    assert(removeYtInFirstIndex("ytamabc") == "ytamabc")
  }

  /*
    Write a Scala program to convert the last 4 characters of a given string in upper case.
    If the length of the string has less than 4 then uppercase all the characters
   */

  test("uppercase last 4 characters when string is 4 characters or more") {
    assert((upperLast4Characters("Scala") == "SCALA"))
    assert((upperLast4Characters("I am good") == "I am GOOD"))
  }

  test("uppercase all 4 characters when string is less than 4 characters") {
    assert((upperLast4Characters("Eat") == "EAT"))
  }

  /*
    Write a Scala program to create a new string which is n (non-negative integer ) copies of a given string
   */

  test("Copy one") {
    assert(copyString("Python", 1) == "Python")
  }

  test("Copy two") {
    assert(copyString("Scala", 2) == "ScalaScala")
  }

  test("Copy six") {
    assert(copyString("JS", 6) == "JSJSJSJSJSJS")
  }


}
