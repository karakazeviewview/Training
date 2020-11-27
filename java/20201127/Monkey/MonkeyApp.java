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
