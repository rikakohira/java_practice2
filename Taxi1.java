public class Taxi1 extends Car1 {
  Taxi1() {
    this(9999);
    System.out.println("Taxi1()");
  }

  Taxi1(int no) { // 2525 → 9999
    super(no);
    System.out.println("Taxi1(int no)");
  }

  Taxi1(String no) {
    System.out.println("Taxi1(String no)");
  }
}
