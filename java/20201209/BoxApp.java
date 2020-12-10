import java.util.*;
public class BoxApp{
	public static void main(String[] args){
		Box box1=new Box("赤","円形",1);
		Box box2=new Box("青","四角",2);
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("1.ボール投入 / 2.ボール取出 / 3.ボール総数表示 / 4.終了>");
			int index=sc.nextInt();
			switch(index){
				case 1:
				System.out.println(box1);
				System.out.println(box2);
				System.out.print("ボールを投入する箱の番号を入力してください>");
				int addIndex=sc.nextInt();
				if(addIndex==0){
					System.out.print("投入するボールの個数を入力してください>");
					int addNum=sc.nextInt();
					box1.insertBalls(addNum);
				}else if(addIndex==1){
					System.out.print("投入するボールの個数を入力してください>");
					int addNum=sc.nextInt();
					box2.insertBalls(addNum);
				}else{
					continue;
				}
				break;
				case 2:
				System.out.println(box1);
				System.out.println(box2);
				System.out.print("ボールを取り出す箱の番号を入力してください>");
				int rmIndex=sc.nextInt();
				System.out.print("取り出すボールの個数を入力してください>");
				int rmNum=sc.nextInt();
				if(rmIndex==1){
					box1.removeBalls(rmNum);
				}else if(rmIndex==2){
					box2.removeBalls(rmNum);
				}else{
					continue;
				}
				break;
				case 3:
				Box.displayTotalNumber();
				break;
				default:
				System.out.println("アプリケーションを終了します。");
				return;
			}
			
		}
	}
}
