6mport java.util.*;
public class BingoGame{
	public static void main(String[] args) throws Exception{
		//ここを記述
		Bingo();
		ageCheck();
		play();
		bingoCount();

		System.out.print("BET枚数を入力。0で終了 1-100>");

		int bet=new Scanner(System.in).nextInt();

	}
}

class Bingo{
	//フィールド変数
  final int BINGO_RATIO=12;
	String userName;
	int userAge;
	int coin;

	public Bingo(String userName,int userAge,int coin){
		//ここを記述、コンストラクタ
		this.userName=userName;
		this.userAge=userAge;
		this.coin=coin;

	}

	public boolean ageCheck(){
	 //ここを記述
	 System.out.print("あなたの名前を入力してください>");
	 String name=new Scanner(System.in).nextLine();
	 System.out.print("あなたの年齢を入力してください>");
	 int age=new Scanner(System.in).nextInt();
	 if(age!>18){
		 System.out.println("こんにちは"+name+"さん");
		 System.out.print("18歳未満の方は遊戯できません");
		 return;
	 }
	}

	public void play(int bet) throws Exception{
		if(this.coin < bet){
			System.out.println("コインが不足しています");
			return;
		}
		this.coin -= bet;
		Random rand=new Random();
		int[] table=new int[9];
		for(int i=0;i<9;i++){
			/*ここに1秒止める処理を記述*/
			Thread.sleep(1000);
			table[i]=rand.nextInt(10);
			System.out.print(table[i]);
			if((i+1) % 3==0){
				System.out.println();
			}
		}
		int bingoCount=bingoCount(table);
		if(bingoCount==0){
			System.out.println("boo");
		}else{
			int win=bet*BINGO_RATIO*bingoCount;
			System.out.println(bingoCount+" LINE BINGO!!win:"+win);
			this.coin += win;
		}
		System.out.printf("%sさんの所持コイン:%d%n",this.userName,this.coin);
	}	

	public int bingoCount(int[] table){
		int[][] bingoIndexCombination={
			{0,1,2},{3,4,5},{6,7,8},
			{0,3,6},{1,4,7},{2,5,8},
			{0,4,8},{2,4,6}
		};
		int bingo=0;
		for(int i=0;i<bingoIndexCombination.length;i++){
			int[] c= bingoIndexCombination[i];
			if(table[0]==1&&table[1]==2){
				bingo++;
			}
		}
		return bingo;
	}
}
