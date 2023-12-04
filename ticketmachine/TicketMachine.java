public class TicketMachine {
  private int price;
  private int balance;
  private float discount;
  private int total;

  public TicketMachine(int price) {
    this.price = price;
    balance = 0;
    total = 0;
    discount = 0.15f;
  }

  public int getPrice() {
    return price;
  }

  public int getBalance() {
    return balance;
  }

  public int getTotal() {
    return total;
  }

  public void issueDiscount() {
    price = Math.round(price - (discount * price));
  }

  public void insertMoney(int amount) {
    if(!(amount > 0)) {
      System.out.println("Use a positive amount rather than " +
                        amount + ".");
      return;
    }
    balance += amount;
  }

  public void printTicket() {
    if(!(balance >= price)) {
      int amountLeftToPay = price - balance;
      System.out.println("You need to insert at least " +
                        amountLeftToPay + " cents.");
      return;
    }
    System.out.println("##########");
    System.out.println("# Ticket");
    System.out.println("# " + price + " cents.");
    if(balance > price) System.out.println("# Value to Refund: " +
                                           (balance - price));
    System.out.println("##########");
    System.out.println();

    total += price;
    balance -= price;
  }

  public int refundBalance() {
    if(!(balance > 0)) {
      return -1;
    }
    int amountToRefund = balance;
    balance = 0;
    return amountToRefund;
  }

  public int emptyMachine() {
    if(balance > 0) {
      return -1;
    }
    int profit = total;
    total = 0;
    return profit;
  }
}
