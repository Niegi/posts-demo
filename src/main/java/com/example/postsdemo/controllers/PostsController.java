package com.example.postsdemo.controllers;

import com.example.postsdemo.model.Post;
import com.example.postsdemo.model.PostRequest;
import com.example.postsdemo.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController implements PostsControllerSwagger{

  @Override
  public ResponseEntity<List<User>> getAllUsers(String firstName) {
    return null;
  }

  @Override
  public ResponseEntity<User> getUserById(String id) {
    return null;
  }

  @Override
  public ResponseEntity<User> createPost(String id, PostRequest postRequest) {
    return null;
  }

  @Override
  public ResponseEntity<Post> updatePost(String userId, String postId) {
    return null;
  }

  @Override
  public ResponseEntity<Post> deletePost(String userId, String postId) {
    return null;
  }
}
