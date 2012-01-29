/**
 * @author avelinsk
 * @since 28.1.2012
 */
public class Wrapper {

  public static String wrap(String lineToWrap, int columns) {
    StringBuilder resultWords = new StringBuilder();
    int firstIdx = lineToWrap.indexOf(' ');
    int lineToWrapLength = lineToWrap.length();

    if ((columns < 1) || (firstIdx == -1) || (lineToWrapLength <= columns)) {
      return lineToWrap;

    } else {
      if (firstIdx >= columns) {
        resultWords.append(lineToWrap.substring(0, firstIdx));
        resultWords.append('\n');
        resultWords.append(wrap(lineToWrap.substring(++firstIdx), columns));

      } else {
        String processLine;
        if (lineToWrapLength >= columns) {
          processLine = lineToWrap.substring(0, columns);
        } else {
          processLine = lineToWrap;
        }
        int idxLast = processLine.lastIndexOf(' ');
        resultWords.append(lineToWrap.substring(0, idxLast));
        resultWords.append('\n');
        resultWords.append(wrap(lineToWrap.substring(++idxLast), columns));

      }
    }
    return resultWords.toString();

  }
}
