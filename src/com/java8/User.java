package com.java8;

import java.util.ArrayList;
import java.util.List;

public class User {
  private Integer id;
  private String name;
  private Integer age;

  public User() {}

  public User(Integer id, String name, Integer age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "id=" + id + ", name='" + name + '\'' + ", age=" + age;
  }

  public static List<User> loadData() {
    List<User> users = new ArrayList<>();
    users.add(new User(1, "Luffy", 19));
    users.add(new User(2, "Zoro", 22));
    users.add(new User(3, "Naruto", 35));
    users.add(new User(4, "Sasuke", 34));
    users.add(new User(5, "Bakugo", 16));
    return users;
  }
}
