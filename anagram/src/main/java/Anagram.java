import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * The Kata finds all anagrams in a list of words, counts them and print them out.
 *
 * @author avelinsk
 */
public class Anagram {

  public static void main(String[] args) {

    List words = parseWordList();


  }

  private static List parseWordList() {
    List<String> words = new ArrayList<String>();
    BufferedReader br = null;
    String line = "";

    try {
      br = new BufferedReader(new FileReader(
              new File("D:\\playground\\CodingKatas\\codebreaker\\src\\main\\resources\\wordlist.txt")));
      while (null != (line = br.readLine())) {
        words.add(line);
      }
    } catch (IOException e1) {
      e1.printStackTrace();
    }

    return words;
  }

  String[] permute(String word) {
    String[] permutaions = new String[5];
//    String[] permutaions = new String[];


    return permutaions;
  }


}
  