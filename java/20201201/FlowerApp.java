import java.util.*;
public class FlowerApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("何色の花にしますか？");
		String color=new Scanner(System.in).nextLine();
		System.out.print("タネをいくつ植えますか？");
		int seedNum=new Scanner(System.in).nextInt();
		
		Flowerbed flower=new Flowerbed(color,seedNum);
		boolean finish=true;
		while(finish){
			System.out.print("何をしますか？");
			int select=scan.nextInt();
			switch(select){
				case 1:
				flower.drawWater();
				break;
				case 2:
				flower.waterFlower();
				break;
				case 3:
				flower.showStatus();
				break;
				case 4:
				finish=false;
				System.out.println("アプリケーションを終了します");
				break;
				scan.close();
			}
		}
	}
}


