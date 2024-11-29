package com.sampleproject

class Order(val orderId: Int, val user: User, val cart: Cart, val shipping: Shipping) {
  def totalAmount(): Double = {
    cart.totalCartValue() + shipping.calculateShippingCost()
  }

  def orderSummary(): String = {
    s"Order ID: $orderId, User: ${user.name}, Total Amount: $$${totalAmount()}"
  }
}
