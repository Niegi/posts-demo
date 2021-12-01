package com.example.postsdemo.model;

import java.util.UUID;

public class Post {
  private String id;
  private String content;

  public Post(String content) {
    id = UUID.randomUUID().toString();
    this.content = content;
  }

  public String getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
