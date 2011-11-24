package coding.dojo.numerals;

/**
 * @author avelinsk
 */
public class Roman extends Numeral {
  private String roman;

  Roman(String roman) {
    this.roman = roman;
  }

  int toArab() {
    int arab = 0;

    for (Pair number : NUMBERS) {
      while (roman.startsWith(number.getRoman())) {
        arab += number.getArab();
        roman = roman.substring(number.getRoman().length());
      }
    }
    return arab;
  }
}
