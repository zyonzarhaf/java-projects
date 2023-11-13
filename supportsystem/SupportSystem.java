import java.util.HashSet;
import java.util.Scanner;

public class SupportSystem {
  private InputReader reader;
  private Responder responder;

  public SupportSystem() {
    reader = new InputReader();
    responder = new Responder();
  }

  public void start() {
    Scanner scanner = new Scanner(System.in);
    boolean finished = false;
    System.out.println("Welcome to our support system!\n" +
      "Ask anything or type 'quit' to quit the interaction\n" +
      "How can we help you?");
    while(!finished) {
      HashSet<String> input = reader.getInput();
      if(input.contains("quit")) {
        finished = true;
      }
      else {
        String response = responder.generateResponse(input);
        System.out.println(response);
      }
    }
    System.out.println("Thank you for using our support system. Goodbye!");
  }
}

