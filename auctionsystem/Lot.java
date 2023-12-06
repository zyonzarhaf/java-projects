public class Lot {
  private String description;
  private int lotNumber;
  private Bid highestBid;

  public Lot(String description, int lotNumber) {
    this.description = description;
    this.lotNumber = lotNumber;
  }

  public String getDescription() {
    return description;
  }

  public int getLotNumber() {
    return lotNumber;
  }

  public Bid getHighestBid() {
    return highestBid;
  }

  public boolean bidFor(Bid bid) {
    if(highestBid != null && highestBid.getValue() >= bid.getValue()) {
      return false;
    }
    highestBid = bid;
    return true;
  }

  public String toString() {
    String details = "{" + lotNumber + ", " + description;
    if(highestBid == null) {
      details += null + "}";
      return details;
    }
    details += highestBid + "}";
    return details;
  }
}
