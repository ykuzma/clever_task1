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
}
