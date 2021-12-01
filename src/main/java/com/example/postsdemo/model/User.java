package com.example.postsdemo.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class User {
  private final String id;
  private String firstName;
  private String lastName;
  private final Map<String, Post> posts;

  public User(String firstName, String lastName) {
    id = UUID.randomUUID().toString();
    this.firstName = firstName;
    this.lastName = lastName;
    posts = new HashMap<>();
  }

  public String getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Map<String, Post> getPosts() {
    return posts;
  }

  public String addPost(PostRequest postRequest) {
    Post post = new Post(postRequest.getContent());
    posts.put(post.getId(), post);
    return post.getId();
  }

  public boolean modifyPost(String id, PostRequest postRequest) {
    Post post = posts.get(id);
    if (post == null) {
      return false;
    }
    post.setContent(postRequest.getContent());
    return true;
  }

  public boolean deletePost(String id) {
    return Optional.ofNullable(posts.remove(id)).isPresent();
  }
}
