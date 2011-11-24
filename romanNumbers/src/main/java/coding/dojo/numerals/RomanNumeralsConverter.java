package coding.dojo.numerals;

/**
 * @author avelinsk
 */
public class RomanNumeralsConverter {

  public static int convertRoman(String roman){
    return new Roman(roman).toArab();
  }

  public static String convertArab(int arab){
    return new Arab(arab).toRoman();
  }

}
