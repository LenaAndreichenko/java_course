package ru.stqa.pft.sandbox;

public class Point {
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int x;
  public int y;

  public double distance(Point p) {
    double d = (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y);
    return Math.sqrt(d);
  }
}