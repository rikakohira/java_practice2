public class Taxi  extends Vehicle {
  public Taxi(int crewNum) {
    super(crewNum);
  } 
  public void showCrewNum() {
    System.out.println("タクシーの乗客：" + crewNum + "名");
  }

}
