package com.java8.functional.interfaces;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * BiConsumer Interface : takes 2 parameter inputs and returns nothing
 * */
public class BiConsumerFI {
  public static void main(String[] args) {
    BiConsumer<Integer, Integer> biConsumer = (a,b) -> System.out.println("Addition result "+(a+b));

    BiConsumer<Integer, Integer> biConsumer2 = (i,j) -> System.out.println("Division "+i/j);
    biConsumer.andThen(biConsumer2).accept(200,400);
  }
}
