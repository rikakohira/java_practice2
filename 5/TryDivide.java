public class TryDivide {
  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);
      System.out.println("a/b=" + (a / b) + "あまり" + (a % b));
    } catch (NumberFormatException e) {
      System.out.println("数値を入力してください");
    } catch (ArithmeticException e) {
      System.out.println("割る数は0以外を入力してください");
    } catch (Exception e) {
      System.out.println("例外が発生しました");
    } finally {
      System.out.println("システムを修了します");
    }

  }
}
