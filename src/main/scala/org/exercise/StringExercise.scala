package org.exercise

object StringExercise {

  def addingIfString(str: String): String = {
    if (str.startsWith("if")) str else "if " + str
  }

  def removeCharacter(str: String, n: Int): String = {
    str.take(n) + str.drop(n + 1)
  }

  def exchangeCharacter(str: String): String = {
    if (str.length <= 1) str
    else str.charAt(str.length - 1) + str.substring(1, str.length-1) + str.charAt(0)
  }

  def duplicateFirstTwoCharacters(str: String) = {
    if (str.length <= 2) str
    else str.substring(0, 2) * 4
  }

  def addLastCharacterToFrontAndBad(str: String): String = {
    if (str.equals("")) {
      return str
    }
    val lastCharacter = str.charAt(str.length - 1)
    lastCharacter + str + lastCharacter
  }

  def addFirstThreeCharacterToFrontAndBad(str: String): String = {
    if (str.length <= 2) str * 3
    else {
      val stringToAdd = str.substring(0, 3)
      stringToAdd + str + stringToAdd
    }
  }

  def removeYtInFirstIndex(str: String): String = {
    if (str.drop(1).startsWith("yt")) str.replaceFirst("yt", "")
    else str
  }

  def upperLast4Characters(str: String): String = {
    if (str.length <= 3) {
      str.toUpperCase()
    }
    else {
      str.substring(0, str.length - 4) + str.substring(str.length-4, str.length).toUpperCase()
    }
  }


  def copyString(str: String, i: Int): String = {
    str * i
  }
}
