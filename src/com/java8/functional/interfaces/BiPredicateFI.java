package com.java8.functional.interfaces;

import com.java8.User;
import java.util.List;
import java.util.function.BiPredicate;

/** Takes two input parameter & returns boolean value */
public class BiPredicateFI {
  public static void main(String[] args) {
    List<User> users = User.loadData();
    users.forEach(System.out::println);
    BiPredicate<User, Integer> biPredicate =
        (user, ageGreaterThan) -> user.getAge() > ageGreaterThan;
    System.out.println("---------After applying BiPredicate-------------");
    users.forEach(
        u -> {
          if (biPredicate.test(u, 25)) {
            System.out.println(u);
          }
        });
  }
}
