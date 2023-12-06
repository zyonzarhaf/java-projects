public class Bid {
  Person person;
  long value;

  public Bid(Person person, long value) {
    this.person = person;
    this.value = value;
  }

  public Person getPerson() {
    return person;
  }

  public long getValue() {
    return value;
  }
}
