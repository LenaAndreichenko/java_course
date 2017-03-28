package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointDifferentQuartersTest {
  @Test
  public void testDifferentQuarter() {
    Point c = new Point(10, 10);
    Point d = new Point(-5, -4);

    Assert.assertEquals(c.distance(d), 20.52);
  }
}