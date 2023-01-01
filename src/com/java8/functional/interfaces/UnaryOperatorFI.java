package com.java8.functional.interfaces;

import com.java8.User;
import java.util.function.UnaryOperator;
/**
 * Take one parameter and performs the operation. it is helpful to use when we want the same value
 * as input and output after performing the operation.
 */
public class UnaryOperatorFI {
  public static void main(String[] args) {
    UnaryOperator<User> unaryOperator =
        (u) -> {
          if (u.getAge() > 20) return u;
          else return null;
        };
    User.loadData().forEach(user -> System.out.println(unaryOperator.apply(user)));
  }
}
