package com.sampleproject

class Cart(val user: User) {
  private var items: List[Product] = List()

  def addItem(product: Product): Unit = {
    items = product :: items
  }

  def removeItem(product: Product): Unit = {
    items = items.filterNot(_ == product)
  }

  def viewCart(): List[Product] = {
    items
  }

  def totalCartValue(): Double = {
    items.map(_.price).sum
  }
}
