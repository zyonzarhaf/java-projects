public class ClockDisplay {
  private NumberDisplay hours;
  private NumberDisplay minutes;
  private String displayString;

  public ClockDisplay() {
    hours = new NumberDisplay(24);
    minutes = new NumberDisplay(60);
    updateDisplay();
  }

  public ClockDisplay(int hour, int minute) {
    hours = new NumberDisplay(24);
    minutes = new NumberDisplay(60);
    setTime(hour, minute);
  }

  public String getTime() {
    return displayString;
  }

  public void setTime(int hour, int minute) {
    hours.setValue(hour);
    minutes.setValue(minute);
    updateDisplay();
  }

  public void timeTick() {
    minutes.increment();
    if(minutes.getValue() == 0) {
      hours.increment();
    }
    updateDisplay();
  }

  public void updateDisplay() {
    int hour = hours.getValue();
    String period = (hour > 12)? " pm" : " am";
    if(hour == 0) {
      hour = 12;
    } 
    else if(hour > 12) {
      hour -= 12;
    }
    displayString = hour + ":" + 
                    minutes.getDisplayValue() +
                    period;
  }
}
