package com.java8.functional.interfaces;

import com.java8.User;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer : Takes one parameter and returns nothing
 * */
public class ConsumerFI {

  public static void main(String[] args) {
    List<User> users = User.loadData();
    Consumer<User> consumer = System.out::println;//method references
    Consumer<User> consumer2 = (u) -> System.out.println(u.getName().toUpperCase());
    users.forEach(u -> consumer.andThen(consumer2).accept(u));//lambda expression
  }
}
