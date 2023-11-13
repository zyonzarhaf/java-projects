import java.util.Scanner;
import java.util.HashSet;

public class InputReader {
  Scanner scanner;
  public InputReader() {
    scanner = new Scanner(System.in);
  }

  public HashSet<String> getInput() {
    System.out.println(">");
    String inputLine = scanner.nextLine().trim().toLowerCase();
    String[] wordsArray = inputLine.split(" ");
    HashSet<String> wordsHash = new HashSet<>();
    for(String word : wordsArray) {
      wordsHash.add(word);
    }
    return wordsHash;
  }
}
