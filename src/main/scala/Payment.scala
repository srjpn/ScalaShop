package com.sampleproject

class Payment(val order: Order, val method: String) {
  def processPayment(): String = {
    s"Processing payment of $${order.totalAmount()} using $method."
  }

  def isPaymentSuccessful(): Boolean = {
    // Simulate a payment success
    true
  }
}
