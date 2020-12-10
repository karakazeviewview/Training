import java.util.*;
public class CatApp{
	public static void main(String[] args){
		System.out.println("***Cat Collection***");
		List<Cat> cats=new ArrayList<>();//リストインターフェイスにCat型を入れる,ArrayListが汎用性が低いため
		Scanner sc=new Scanner(System.in);//スキャナーのnewをする
		while(true){
			System.out.print("1.Collect 2.Play 3.End>");
			int act=sc.nextInt();
			switch(act){
				case 1:
					cats.add(new Cat());//catsのArrayListの中身をaddして、newしたCatクラスのコンストラクタ
					break;
				case 2:
					if(cats.isEmpty()){//catsのリストの中をからかどうか判定し、空だったら実行
						System.out.println("You do not have anyone to play with.");
						continue;//スキップしてファイルの判定の部分に戻る
					}
					for(int i=0;i<cats.size();i++){
						System.out.printf("%d・・・%s[%s](%d)%n",i,cats.get(i).getName(),cats.get(i).getType(),cats.get(i).getIntimacy());//catsアレイリストのゲットメソッドを使って、i番目の要素を取り出す
					}
					System.out.print("Who do you play with?>");
					int playWith=sc.nextInt();
					if(playWith < cats.size()){
						cats.get(playWith).catPlay();
					}else{
						System.out.println("Select exits number please!!! ");
					}
					break;
				default :
					System.out.println("Game over");
					return;
			}
		}
	}
}

