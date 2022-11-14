package mypack;

public class Sample {
  public static void main(String[] args) {
    Taxi taxi = new Taxi(5);
    Train train = new Train(2);
    Bus bus = new Bus(8);

    taxi.showCrewNum();
    train.showCrewNum();
    bus.showCrewNum();

    taxi.stop();
    bus.stop();
  }

}
