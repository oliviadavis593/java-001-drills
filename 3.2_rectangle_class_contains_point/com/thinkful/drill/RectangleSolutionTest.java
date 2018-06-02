package com.thinkful.drill;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RectangleSolutionTest {

  private Rectangle exampleRectangle = new Rectangle();
  private Rectangle exampleRectangleWithParams = new Rectangle(0,0,10,5);

  @Before
  public void preTest() { }


  @Test
  public void test() {
    assertEquals(exampleRectangle.getHeight(), 4);
    assertEquals(exampleRectangleWithParams.getHeight(), 10);
    assertEquals(exampleRectangleWithParams.contains(0,0), true);
    assertEquals(exampleRectangleWithParams.contains(0,20), false);
    assertEquals(exampleRectangleWithParams.contains(50,50), false);

  }

  @After
  public void postTest() {}

}
