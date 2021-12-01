package com.example.postsdemo.services;

import com.example.postsdemo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
  private final List<User> users = new ArrayList<>();

  public UserService() {
    initializeUsers();
  }

  private void initializeUsers() {
//    todo
  }
}
