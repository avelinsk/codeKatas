package coding.dojo.numerals;

/**
 * @author avelinsk
 */
public class Arab extends Numeral {
  private int arab;

  Arab(int arab) {
    this.arab = arab;
  }

  String toRoman() {
    String roman = "";
    for (Pair number : NUMBERS) {
      while (arab >= number.getArab()) {
        roman = roman.concat(number.getRoman());
        arab -= number.getArab();
      }
    }

    return roman;
  }
}
