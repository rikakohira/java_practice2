import java.util.ArrayList;

public class ArrayListSample {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("We");
    list.add("enjoy");
    list.add("Java!");

    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
      System.out.print(" ");
    }

  }
}
