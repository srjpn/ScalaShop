package com.sampleproject

class User(val name: String, val age: Int) {
  def greet(): String = {
    s"Hello, my name is $name and I am $age years old."
  }

  def isAdult(): Boolean = {
    age >= 18
  }
}
