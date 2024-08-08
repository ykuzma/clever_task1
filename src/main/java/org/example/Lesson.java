package org.example;

import java.time.LocalDateTime;

public class Lesson {
   private LocalDateTime dateTime;
   private String topic;

   public Lesson(LocalDateTime dateTime, String topic) {
      this.dateTime = dateTime;
      this.topic = topic;
   }

   public Lesson() {
   }

   public LocalDateTime getDateTime() {
      return dateTime;
   }

   public void setDateTime(LocalDateTime dateTime) {
      this.dateTime = dateTime;
   }

   public String getTopic() {
      return topic;
   }

   public void setTopic(String topic) {
      this.topic = topic;
   }
}
