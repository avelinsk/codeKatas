package coding.dojo.numerals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertEquals;

/**
 * @author avelinsk
 */
@RunWith(value = Parameterized.class)
public class RomanNumeralsTest {

  private final int arab;
  private final String roman;

  public RomanNumeralsTest(final int arab, final String roman) {
    this.arab = arab;
    this.roman = roman;
  }

  @Test
  public void getRoman() {
    assertEquals(roman, RomanNumeralsConverter.convertArab(arab));
  }

  @Test
  public void getArabic() {
    assertEquals(arab, RomanNumeralsConverter.convertRoman(roman));
  }

  @Parameters
  public static Collection<Object[]> numerals() {
    Object[][] numerals = {
            {90, "XC"},
            {40, "XL"},
            {99, "XCIX"},
            {6, "VI"},
            {8, "VIII"},
            {11, "XI"}
    };
    return Arrays.asList(numerals);
  }

}
