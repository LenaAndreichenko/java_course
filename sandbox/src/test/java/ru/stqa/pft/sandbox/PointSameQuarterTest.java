package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointSameQuarterTest {
  @Test
  public void testSameQuarter() {
    Point a = new Point(4, 2);
    Point b = new Point(6, 3);

    Assert.assertEquals(a.distance(b), 2.24);
  }
}