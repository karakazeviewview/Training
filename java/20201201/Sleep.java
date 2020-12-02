public class Sleep{
  public static void main(String[] args){
    try{
      System.out.println("5秒停止します");
      Thread.sleep(5000);
      System.out.println("一時停止を解除しました。");
    }catch(InterruptedException e){
      e.printStackTrace();
    }
  }
}
