public class MonkeyApp{
	public static void main(String[] args){
		System.out.println("お猿の名前を決めてください:>");
		String name=new java.util.Scanner(System.in).nextLine();
		System.out.print("おさるの歳を決めてください");
		int age=new java.util.Scanner(System.in).nextInt();
		Monkey m=new Monkey(name,age);
		int act=0;
		while(act!=4){
		
			System.out.print("お猿に何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			act=new java.util.Scanner(System.in).nextInt();
			switch(act){
				case 1:
					m.greet();
					break;
				case 2:
					m.takeuma();
					break;
				case 3:
					m.sakadachi();
					break;
				case 4:
					break;
			}
		}
	}
}


import java.util.Scanner;
public class MonkeyApp {
	public static void main(String[] args) {
		//スキャナーインスタンスを生成
		Scanner scan =new Scanner(System.in);
		//名前をきく
		System.out.print("おさるの名前を決めてください:>");
		String name=scan.next();
		//歳をきく
		System.out.print("おさるの歳を決めてください:>");
		int age=scan.nextInt();
		//Monkeyインスタンス生成
		Monkey monkey=new Monkey(name,age);
		//繰り返し処理
		while(true){
			System.out.print("おさるに何をさせますか？1...挨拶、2...竹馬、3...逆立ち、4...終了>");
			int select =scan.nextInt();
			switch(select){
			case 1:
				monkey.greet();
				break;
			case 2:
				monkey.takeuma();
				break;
			case 3:
				monkey.sakadachi();
				break;
			default:
				System.out.println("アプリケーションを終了します。");
				scan.close();
				//リターンでメソッドを抜ける（mainメソッドを抜けて終了)
				return;		
			}
		}	
	}
}
