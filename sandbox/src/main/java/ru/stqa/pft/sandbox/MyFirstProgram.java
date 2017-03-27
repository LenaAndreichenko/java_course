package ru.stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Lena");

    Square s = new Square(5);
    //System.out.println("Area of square with side - " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Area of rectangle with sides " + r.a + " and " + r.b + " = " + area(r));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }
}