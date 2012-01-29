import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
* @author avelinsk
* @since 28.01.2012
*/
public class WordWrapperTest {

  @Test
  public void testStringTooLong(){
    assertEquals("wordisnotenough", Wrapper.wrap("wordisnotenough", 4));
  }

  @Test
  public void testBeginnigSpace() {
    assertEquals("word\nword", Wrapper.wrap("word word", 4));
  }

  @Test
  public void testTrailingSpace() {
    assertEquals("word\nword", Wrapper.wrap("word word", 5));
  }

  @Test
  public void testColumnSize() {
    assertEquals("word word", Wrapper.wrap("word word", 0));
  }

  @Test
  public void testMinColumnSize() {
    assertEquals("a\nbcd\nde\nfghijklm\no\np\nqr\ns\n", Wrapper.wrap("a bcd de fghijklm o p qr s ", 1));
  }

  @Test
  public void testMaxColumnSize() {
    assertEquals("word word", Wrapper.wrap("word word", 120));
  }
}
