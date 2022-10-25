public final class Student extends Person {
  // private int stuNo;

  // public void setStuNo(int s) {
  //   stuNo = s;

  // public void displayStuNo() {
  //   System.out.println("学籍番号：" + stuNo);
  // }
  
  // private int stuNo;

  // public void setStuNo(int s){
  //   stuNo = s;
  // }

  // public void display(){
   //   System.out.println("名前：" + getName());
  //   System.out.println("学籍番号：" + stuNo);
  // }

  // private int stuNo;

  // public Student(String name) {
  //   this(name, 999);
  // }

  // public Student(String name, int stuNo){
  //   super(name);
  //   this.stuNo = stuNo;
  // }

  // public void display() {
  //   super.display();
  //  

  private int stuNo;
  
  public Student(String name, int stuNo){  // 菅原, 1001
    super(name); 
    this.stuNo = stuNo;
  } 

  public void display() {
    super.display();
    System.out.println("学籍番号：" + stuNo);
  }
  
}

  
