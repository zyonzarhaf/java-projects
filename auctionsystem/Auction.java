import java.util.ArrayList;

public class Auction {
  private ArrayList<Lot> lots;
  private int nextLotNumber;

  public Auction() {
    lots = new ArrayList<Lot>();
    nextLotNumber = 1;
  }

  public void enterLot(String description) {
    lots.add(new Lot(description, nextLotNumber));
    nextLotNumber++;
  }

  public void listLots() {
    for(Lot lot : lots) {
      System.out.println(lot.toString());
    }
  }

  public Lot getLot(int lotNumber) {
    if(!(lotNumber >= 0 && lotNumber < nextLotNumber)) {
      System.out.println("Lot number " + lotNumber + " doesn't exist");
      return null;
    } 
    Lot lot = lots.get(lotNumber - 1);
    if(lot.getLotNumber() != lotNumber) {
      System.out.println("Internal error: lot number " + lot.getLotNumber() + " was returned instead of lot number " + lotNumber + ".");
      return null;
    }
    return lot;
  }

  public void bidFor(Person bidder, int lotNumber, long value) {
    Lot lot = getLot(lotNumber);
    if(lot != null) {
      Bid bid = new Bid(bidder, value);
      boolean success = lot.bidFor(bid);
      if(!success) {
        Bid highestBid = lot.getHighestBid();
        System.out.println("Lot number " + lotNumber +
          " already has a bid of " + highestBid.getValue());
        return;
      }
      Bid highestBid = lot.getHighestBid();
      System.out.println("The highest bid for the lot number " + lotNumber +
        " is now " + highestBid.getValue() + ".");
      return;
    }
  }
}
