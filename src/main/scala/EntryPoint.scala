package com.sampleproject

class EntryPoint {
  def main(args: Array[String]): Unit = {
    println("Welcome to the Sample Scala Project with Nested Dependencies!")

    val user = new User("Alice", 30)
    println(user.greet())

    val product = new Product(1, "Laptop", 999.99)
    println(product.displayInfo())

    val cart = new Cart(user)
    cart.addItem(product)
    println(s"Total cart value: $${cart.totalCartValue()}")

    val shipping = new Shipping("123 Main St", "Standard")
    val order = new Order(101, user, cart, shipping)
    println(order.orderSummary())

    val payment = new Payment(order, "Credit Card")
    println(payment.processPayment())

    val review = new Review(product.id, 1, 5, "Great product!")
    println(review.displayReview())

    val notification = new Notification("Your order has been shipped!", user.age)
    println(notification.sendNotification())
  }
}
