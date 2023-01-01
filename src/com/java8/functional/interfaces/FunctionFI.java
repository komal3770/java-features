package com.java8.functional.interfaces;

import com.java8.User;
import java.util.function.Function;

/** Take one argument and give output or can return any value. */
public class FunctionFI {
  public static void main(String[] args) {
    Function<User, String> function = (u) -> u.getName().toLowerCase().toUpperCase();
    User.loadData().forEach(u -> System.out.println(function.apply(u)));
  }
}
