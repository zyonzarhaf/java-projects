public class NumberDisplay {
  private int limit;
  private int value;

  public NumberDisplay(int rollOverLimit) {
    limit = rollOverLimit;
    value = 0;
  }

  public int getValue() {
    return value;
  }

  public int setValue(int value) {
    if(!(value >= 0 && value < limit)) {
      return -1;
    }
    this.value = value;
    return 1;
  }

  public String getDisplayValue() {
    if(!(value >= 10)) {
      return "0" + value;
    }
    return "" + value;
  }

  public void increment() {
    value = (value + 1) % limit;
  }
}
