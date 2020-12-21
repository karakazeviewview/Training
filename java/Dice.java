import java.util.*;
public class Dice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		final int PLAYER_NUM=2;//何人で遊ぶか?
		char suffix='A';//名前の最初の文字
		int[] playerPoints=new int[PLAYER_NUM];//プレイヤーごとの現在地を保存
		char[] playerSuffix=new char[PLAYER_NUM];//プレイヤーごとの名前配列
		for(int i=0;i<PLAYER_NUM;i++){
			playerSuffix[i]=suffix++;//A,B,C,....
		}
		System.out.print("目標ポイントを設定してください>");
		int goal=scan.nextInt();
		//プレイヤー配列indexの循環無限ループ(0,1,2,0,1,2....)
		for(int i=0;;i=++i%PLAYER_NUM){
			int startPoint=playerPoints[i];//初期位置を保存しておく
			System.out.printf("%n%sのターン%nサイコロを振ります%n",playerSuffix[i]);
			//ターン処理（何回継続させるかわからないのでwhile)
			while(true){
				int num = rand.nextInt(6) + 1;
				String str="サイコロの目は";
				if (playerPoints[i]==0) {
					str="最初の目は";
				} 
				System.out.println(str + num);
				if(num==1){
					System.out.printf("残念!ポイントは(%d)に戻った%n", startPoint);
					playerPoints[i]=startPoint;
					break;
				}
				playerPoints[i] += num;//1以外なら現在地をnumの数だけ増やす
				if(playerPoints[i]>=goal){
					//ゴール地点にくればそのindexの人の勝ち
					System.out.printf("%s　Win!%n",playerSuffix[i]);
					return;
				}
				System.out.printf("現在のポイント(%d)%n",playerPoints[i]);
				System.out.print("さらにサイコロを振る？　1:振る2:やめとく>");
				int select=scan.nextInt();
				if(select != 1){
					System.out.println("ターン終了");	
					break;
				}
			}
		}
	}
}
