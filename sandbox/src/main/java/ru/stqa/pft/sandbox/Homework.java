package ru.stqa.pft.sandbox;

public class Homework {
  public static void main(String[] args) {

    Point a = new Point(4, 2);
    Point b = new Point(6, 3);
    Point c = new Point(10, 10);
    Point d = new Point(-5, -4);
    Point e = new Point(0, 0);

    System.out.println("d1 = " + distance(a, b));
    System.out.println("d2 = " + distance(c, d));
    System.out.println("d3 = " + distance(c, c));
    System.out.println("d4 = " + distance(c, e));
  }

  public static double distance(Point a, Point b) {
    double d = (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
    double distance = Math.sqrt(d);
    return distance;
  }
}
