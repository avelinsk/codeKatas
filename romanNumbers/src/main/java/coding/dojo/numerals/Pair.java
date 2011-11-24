package coding.dojo.numerals;

/**
 * @author avelinsk
 */
public class Pair {

  private int arab;
  private String roman;


  Pair(int arab, String roman) {
    super();
    this.arab = arab;
    this.roman = roman;
  }

  int getArab(){
    return this.arab;
  }

  String getRoman() {
    return this.roman;
  }

}
