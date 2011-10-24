import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * @author avelinsk
 */
public class StringCalculatorTest {
  StringCalculator sc;

  @Before
  public void setUp() {
    sc = new StringCalculator();
  }

  @After
  public void tearDown() {
    sc = null;
  }

  @Test
  public void testAdd() {
    String empty = "";
    String one = "1";
    String two = "1,3";

    assertEquals(0, sc.add(empty));

    assertEquals(1, sc.add(one));

    assertEquals(4, sc.add(two));

  }

  @Test
  public void testException() {
    String test = "-1\n-4";

    try {
      sc.add(test);
      fail();
    } catch (Exception e) {
      assertEquals("Negatives not allowed: -1 -4", e.getMessage());
      assertTrue(e instanceof RuntimeException);
    }
  }
  @Test
  public void testDelimiter(){
    String test = "//;\n1;3;7";
    assertEquals(11, sc.add(test));
  }

  @Test
  public void testNewLine(){
    String test = "1\n2,4";
    assertEquals(7, sc.add(test));
  }

}
