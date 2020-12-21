import java.util.Random;
class Random {
  public static void main(String args[]) {
    Random rand = new Random();
    int num = rand.nextInt(10) + 100;
    System.out.println(num);
  }
}
