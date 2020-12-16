import java.util.*;
public class Slime{
private static int totalSlime;
private int no;
public Slime(){
	totalSlime++;
		this.no=totalSlime;
		System.out.println("スライム"+this.no+"を生成しました");
	}

	public static int getTotalSlime(){
		return totalSlime;
	}

	public void slimeAttack(){
		System.out.println("スライム"+this.no+"の攻撃、5ポイントのダメージ");
	}

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.print("操作を入力してください1…Archer生成,2…Archerの総数確認,3…終了>");
			int select=s.nextInt();
			switch(select){
				case 1:
				Slime sl=new Slime();
				break;
				case 2:
				System.out.println("Slimeクラスから"+Slime.getTotalSlime()+"のスライムが生成されました");
				break;
				default:
				System.out.println("終了");
				s.close();
				return;
		}
	}
}


}
