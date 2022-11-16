import java.util.ArrayList;
import java.util.Iterator;

public class NameArray {
  public static void main(String[] args) {
    // String[] names = { "櫻井", "田原", "中川", "鈴木" };

    ArrayList<String> names = new ArrayList<String>();
    names.add("櫻井");
    names.add("田原");
    names.add("中川");
    names.add("鈴木");
    String search = args[0];
    boolean result = false;

    // for (int i = 0; i < names.size(); i++) {
    // if (names.get(i).equals(search)) {
    // result = true;
    // }
    // }

    Iterator<String> it = names.iterator();
    while (it.hasNext()) {
      if (it.next().equals(search)) {
        result = true;
      }
    }
    if (result) {
      System.out.println(search + "さんは含まれています");
    } else {
      System.out.println(search + "さんは含まれていません");
    }

  }
}
