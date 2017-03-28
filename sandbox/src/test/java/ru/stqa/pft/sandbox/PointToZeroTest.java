package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointToZeroTest {
  @Test
  public void testPointToZero() {
    Point f = new Point(10, 10);
    Point g = new Point(0, 0);

    Assert.assertEquals(f.distance(g), 14.14);
  }
}