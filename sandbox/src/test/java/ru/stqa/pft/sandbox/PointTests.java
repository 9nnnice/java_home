package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testArea() {
    Point one = new Point(1, 3);
    Point two = new Point(4, 6);
    System.out.println("Расстояние между двумя точками: " + one.distance(two));
    Assert.assertNotNull(one.distance(two));
    Assert.assertEquals(one.distance(two), 4.242640687119285);
  }

}
