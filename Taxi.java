public class Taxi extends Car {
  private int price;

  public Taxi(int no) {
    this(no, 0);
  }

  public Taxi(int no, int price) {
    super(no);
    this.price = price;
  }

  public void start() {
    price = 420;
  }

  public void run() {
    price += 80;
  }

  public void display() {
    super.display();
    System.out.println("料金は" + price + "です。");
  }

}
