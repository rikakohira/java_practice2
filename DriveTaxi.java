import mypack.Taxi;

public class DriveTaxi {
  public static void main(String[] argS) {
    Taxi t1 = new Taxi(2525);
    t1.start();
    t1.run();
    t1.display();
  }
}
