package com.java8.functional.interfaces;

import com.java8.User;
import java.util.List;
import java.util.function.Predicate;
/**
 * Takes one input parameter & returns boolean value
 * */
public class PredicateFI {
  public static void main(String[] args) {
    List<User> users = User.loadData();
    users.forEach(System.out::println);
    Predicate<User> predicate = (u) -> u.getAge() > 20;
    System.out.println("---------After applying predicate-------------");
    users.forEach(
        u -> {
          if (predicate.test(u)) {
            System.out.println(u);
          }
        });
  }
}
