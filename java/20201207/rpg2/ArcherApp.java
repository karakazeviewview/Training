import java.util.*;
public class ArcherApp{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		while(true){
			System.out.print("操作を入力してください1…Archer生成,2…Archerの総数確認,3…終了>");
			int select=s.nextInt();
			switch(select){
				case 1:
					Archer a=new Archer();
					break;
				case 2:
					System.out.println("Archerクラスから"+Archer.getTotalArcher()+"人のアーチャーが生成されました");
					break;
					case 3:
					getShootArrow();
					break;
				default:
					System.out.println("アプリケーションを終了します");
					s.close();
					return;
			}
		}
	}
}
