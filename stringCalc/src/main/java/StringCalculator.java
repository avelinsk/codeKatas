/**
 * @author avelinsk
 */
public class StringCalculator {

  public int add(String numbers) throws RuntimeException {
    String separator;

    if (numbers.startsWith("//")) {
      char str = numbers.charAt(2);
      separator = String.valueOf(str);
      numbers = numbers.substring(4);

    } else {
      separator = "\\,";
    }

    if (numbers.contains("\n")) {
      numbers = numbers.replaceAll("\\\n", separator);
    }

    String[] args = numbers.split(separator);

    Integer sum = 0;
    boolean negative = false;
    StringBuilder negatives = new StringBuilder();
    for (String tmp : args) {
      if (tmp.equals("")) {
        return sum;
      }

      Integer number = new Integer(tmp);
      if (number < 0) {
        negatives.append(" ").append(tmp);
        negative = true;
      }
      sum += number;
    }

    if (negative) {
      System.out.println("negatives " + negatives);
      throw new RuntimeException("Negatives not allowed:" + negatives);
    }

    return sum;
  }
}
