import java.util.*;
public class PoolApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("給水する水量を入力してください>");
		double feed=new Scanner(System.in).nextDouble();
		System.out.print("排水する水量を入力してください>");
		double drain=new Scanner(System.in).nextDouble();
		
		Pool pool=new Pool(water,feed,drain);
		while(true){
			System.out.print("1.給水/2.排水/3.表示/4.終了 >");
			int select=scan.nextInt();
			switch(select){
				case 1:
				pool.feedWater();
				break;
				case 2:
				pool.drainWater();
				break;
				case 3:
				pool.display();
				break;
				default:
				System.out.println("アプリケーションを終了します");
				return;

			}
		}
	}
}
