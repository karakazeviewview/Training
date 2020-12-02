import java.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		System.out.print("最初に給紙する枚数を入力してください>");
		int numPaper=new Scanner(System.in).nextInt();
		CopyMachine cm=new CopyMachine(numPaper);
		while(true){
			System.out.print("1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>");
			int select=new Scanner(System.in).nextInt();
			switch(select){
				case 1:
				System.out.print("給紙する枚数を指定してください。");
				int sheet1=new Scanner(System.in).nextInt();
				cm.feedPaper(sheet1);
				break;
				case 2:
				System.out.print("コピーする枚数を入力してください。");
				int sheet2=new Scanner(System.in).nextInt();
				cm.copy(sheet2);
				break;
				case 3:
				cm.display();
				break;
				default:
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	}
}
