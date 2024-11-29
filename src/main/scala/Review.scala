package com.sampleproject

class Review(val productId: Int, val userId: Int, val rating: Int, val comment: String) {
  def displayReview(): String = {
    s"Product ID: $productId, User ID: $userId, Rating: $rating, Comment: $comment"
  }

  def isPositive(): Boolean = {
    rating >= 4
  }
}
