package com.sampleproject

class Shipping(val address: String, val method: String) {
  def calculateShippingCost(): Double = {
    method match {
      case "Standard" => 5.0
      case "Express" => 10.0
      case _ => 0.0
    }
  }

  def shipOrder(): String = {
    s"Shipping to $address using $method method."
  }
}
