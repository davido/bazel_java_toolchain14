public class Javac14Example {
  record Point(int x, int y) {}

  public static void main(String[] args) {
    Point point = new Point(0, 1);
    System.out.println(point.x);
  }
}
