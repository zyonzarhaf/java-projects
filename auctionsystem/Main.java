public class Main {
  public static void main(String[] args) {
    Auction auction = new Auction();
    auction.enterLot("Grandma's old chair");
    
    Person john = new Person("John");
    auction.bidFor(john, 1, 500);

    Person hannah = new Person("Hannah");
    auction.bidFor(hannah, 1, 800);

    Person carla = new Person("Carla");
    auction.bidFor(carla, 1, 600);

    Person michael = new Person("Michael");
    auction.bidFor(michael, 2, 300);
  }
}
