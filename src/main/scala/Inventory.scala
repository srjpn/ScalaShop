package com.sampleproject

class Inventory {
  private var stock: Map[Product, Int] = Map()

  def addProduct(product: Product, quantity: Int): Unit = {
    stock = stock + (product -> (stock.getOrElse(product, 0) + quantity))
  }

  def removeProduct(product: Product, quantity: Int): Boolean = {
    if (stock.getOrElse(product, 0) >= quantity) {
      stock = stock + (product -> (stock(product) - quantity))
      true
    } else {
      false
    }
  }

  def checkStock(product: Product): Int = {
    stock.getOrElse(product, 0)
  }
}
