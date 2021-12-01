package com.example.postsdemo.controllers;

import com.example.postsdemo.model.Post;
import com.example.postsdemo.model.PostRequest;
import com.example.postsdemo.model.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface PostsControllerSwagger {

  String USERS_PATH = "/users";

  @ApiOperation(value = "Get all users")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Users", response = User.class, responseContainer = "List")
  })
  @GetMapping(path = USERS_PATH)
  ResponseEntity<List<User>> getAllUsers(@RequestParam String firstName);

  @ApiOperation(value = "Get user with a given id")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "User", response = User.class),
    @ApiResponse(code = 404, message = "User not found")
  })
  @GetMapping(path = USERS_PATH + "/{id}")
  ResponseEntity<User> getUserById(@PathVariable String id);

  @ApiOperation(value = "Create new post for a user with a given id")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "User", response = User.class),
    @ApiResponse(code = 404, message = "User not found")
  })
  @PostMapping(path = USERS_PATH + "/{id}/post")
  ResponseEntity<User> createPost(@PathVariable String id, @RequestBody PostRequest postRequest);

  @ApiOperation(value = "Update post with a given id for a user with a given id")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Post", response = Post.class),
    @ApiResponse(code = 404, message = "User not found"),
    @ApiResponse(code = 404, message = "Post not found")
  })
  @PutMapping(path = USERS_PATH + "/{userId}/post/{postId}")
  ResponseEntity<Post> updatePost(@PathVariable String userId, @PathVariable String postId);

  @ApiOperation(value = "Delete post with a given id for a user with a given id")
  @ApiResponses(value = {
    @ApiResponse(code = 200, message = "Post", response = Post.class),
    @ApiResponse(code = 404, message = "User not found"),
    @ApiResponse(code = 404, message = "Post not found")
  })
  @DeleteMapping(path = USERS_PATH + "/{userId}/post/{postId}")
  ResponseEntity<Post> deletePost(@PathVariable String userId, @PathVariable String postId);
}
