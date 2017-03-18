package ru.stqa.pft.sandbox;

public class Point {
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int x;
  public int y;

  public static double distance(Point a, Point b) {
    double d = (a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y);
    return Math.sqrt(d);
  }
}