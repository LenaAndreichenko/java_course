package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointNoLengthTest {
  @Test
  public void testNoLength() {
    Point e = new Point(10, 10);
    Assert.assertEquals(e.distance(e), 0.0);
  }
}