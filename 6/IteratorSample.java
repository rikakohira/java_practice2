import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(19);
    list.add(300);

    Iterator<Integer> it = list.iterator();

    while (it.hasNext()) {
      System.out.print(it.next());
      System.out.print(" ");
    }
  }

}
