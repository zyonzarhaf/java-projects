import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;

public class Responder {
  private HashMap<String, String> responseMap;
  private ArrayList<String> defaultResponses;
  private Random random;

  public Responder() {
    responseMap = new HashMap<>();
    defaultResponses = new ArrayList<>();
    random = new Random();
    fillDefaultResponses();
    fillResponseMap();
  }

  public String generateResponse(HashSet<String> input) {
    for(String word : input) {
      String response = responseMap.get(word);
      if(response != null) {
        return response;
      }
    } 
    return getRandomDefaultResponse();
  }

  private String getRandomDefaultResponse() {
    int randomIndex = random.nextInt(defaultResponses.size());
    return defaultResponses.get(randomIndex);
  }

  private void fillResponseMap() {
    responseMap.put("crash",
      "Well, it never crashes on our system. It must have " +
      "something to do with your system. Tell me more about " +
      "your configuration.");

    responseMap.put("crashes",
      "Well, it never crashes on our system. It must have " +
      "something to do with your system. Tell me more about " +
      "your configuration.");

    responseMap.put("crashing",
      "Well, it never crashes on our system. It must have " +
      "something to do with your system. Tell me more about " +
      "your configuration.");

    responseMap.put("slow", "The app may be slow due to " + 
      "network issues. Please check your internet connection " + 
      "and try again.");

    responseMap.put("login", "Please check your login credentials and " + 
      "try again. If you continue to have issues, please " +
      "reset your password. ");

    responseMap.put("freeze", "If the app is freezing, try clearing the " +
      "cache and data. If the issue persists, please " +
      "uninstall and reinstall the app.");

    responseMap.put("compatibility", "The app may not be compatible with " +
      "your device's operating system. Please check the " +
      "app's requirements and ensure your device meets " +
      "them.");

    responseMap.put("notifications", "Please check your notification " +
      "settings and ensure they are enabled for the app. " +
      "If the issue persists, try restarting your " +
      "device.");

    responseMap.put("battery", "The app may be draining your battery. " + 
      "Please check your battery usage settings and ensure " +
      "the app is not running in the background " +
      "unnecessarily.");

    responseMap.put("payment", "If you are experiencing issues with " +
      "payments, please ensure your payment method is up " +
      "to date and valid. If the issue persists, please " +
      "contact customer support.");

    responseMap.put("updates", "Please ensure you have the latest " +
      "version of the app installed. If not, please update " +
      "the app and try again.");

    responseMap.put("features", "If you are having issues with specific " +
      "features, please ensure you are using them correctly. " +
      "If the issue persists, please contact customer " +
      "support.");
  }

  private void fillDefaultResponses() {
    defaultResponses.add("I'm sorry, I'm having trouble understanding " +
      "your question. Can you please provide more " +
      "details?");

    defaultResponses.add("I'm not sure I understand your question. " +
      "Can you please rephrase it in a different " +
      "way?");

    defaultResponses.add("To better assist you, can you please provide " +
      "more specific information about the issue " +
      "you are experiencing?");
  }
}
