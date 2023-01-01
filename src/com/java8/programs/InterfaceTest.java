package com.java8.programs;

/**
 * Functional interface with default & static method is still functional interface.
 * */
@FunctionalInterface
interface Interface1{
  void demo();
  default void demoDefault(){
    System.out.println("Interface1 :: Default method");
  }
  static void demoStatic(){
    System.out.println("Interface1 :: Static method");
  }
}

@FunctionalInterface
interface Interface2{
  void demo();
  default void demoDefault(){
    System.out.println("Interface2 :: Default method");
  }
  static void demoStatic(){
    System.out.println("Interface2 :: Static method");
  }
}
/**
 * Checking hybrid inheritence
 * */
class A implements Interface1, Interface2{

  @Override
  public void demo() {
    System.out.println("Implemented demo");
  }
  //Forced to implement default method when two interface having same default methods
  @Override
  public void demoDefault() {
    System.out.println("Class method");
  }
}

public class InterfaceTest {
  public static void main(String[] args) {
    A a = new A();
    a.demoDefault();//Lets see which interface default method gets called.

    Interface1 interface1 = new A();
    interface1.demoDefault();//Default method implementation get replaced by class me

    Interface2 interface2 = new A();
    interface2.demoDefault();//Default method implementation get replaced by class me

   Interface1.demoStatic();

  }
}
