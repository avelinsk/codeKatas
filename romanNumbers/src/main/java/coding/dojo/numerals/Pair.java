package coding.dojo.numerals;

/**
 * @author avelinsk
 */
public class Pair {

  private int arab;
  private String roman;


  public Pair(int arab, String roman) {
    super();
    this.arab = arab;
    this.roman = roman;
  }

  public int getArab(){
    return this.arab;
  }

  protected String getRoman() {
    return this.roman;
  }

}
