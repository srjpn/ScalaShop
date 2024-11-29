package com.sampleproject

class Notification(val message: String, val userId: Int) {
  def sendNotification(): String = {
    s"Sending notification to user $userId: $message"
  }

  def isUrgent(): Boolean = {
    message.contains("urgent")
  }
}
