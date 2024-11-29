package com.sampleproject

class Product(val id: Int, val name: String, val price: Double) {
  def displayInfo(): String = {
    s"Product ID: $id, Name: $name, Price: $$price"
  }

  def applyDiscount(discount: Double): Double = {
    price - (price * discount / 100)
  }
}
