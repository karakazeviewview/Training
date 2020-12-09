import java.util.*;
public class ArcherApp3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.print("操作を入力してください1...Archer生成,2...Archerの総数確認,3...Archer10人生成,4...終了>");
			int select=scan.nextInt();
			switch(select){
				case 1:
					new Archer();
					break;
				case 2:
					System.out.println("Archerクラスから"+Archer.getTotalArcher()+"人のアーチャーが生成されました。");
					break;
				case 3:
					System.out.println("アーチャー10人同時生成");
					Archer[] archers=new Archer[10];
					for(int i=0;i<archers.length;i++){
						archers[i]=new Archer();
					}
					System.out.print("アーチャー番号を入力(1~10):");
					int no=scan.nextInt();
					archers[no-1].shootArrow();
					break;
				default:
					System.out.println("終了");
					scan.close();
					return;
			}
		}
	}
}
