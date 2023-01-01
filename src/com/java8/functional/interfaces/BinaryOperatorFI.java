package com.java8.functional.interfaces;

import com.java8.User;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorFI {
  public static void main(String[] args) {
    List<User> users = User.loadData();
    //Create comparator for User
    Comparator<User> comparator = Comparator.comparing(User::getAge);
    //Create custom binary operator
    BinaryOperator<User> bo = BinaryOperator.maxBy(comparator);

    //Apply binary operator
    User user = null;
    for (User u : users) {
      if (user == null) {
        user = u;
      } else {
        user = bo.apply(user, u);
      }
    }
    System.out.println("After applying binary operator "+user);
  }
}
