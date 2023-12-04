public class Main {
  public static void main(String[] args) {
    ClockDisplay clock = new ClockDisplay();
    System.out.println(clock.getTime());
    clock.timeTick();
    System.out.println(clock.getTime());
    clock.timeTick();
    System.out.println(clock.getTime());
  }
} 
