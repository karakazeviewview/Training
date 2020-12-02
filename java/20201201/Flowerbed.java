import java.util.*;
public class Flowerbed{
public final int MAXWATER=3;
	//フィールド変数
	public String color;
	public int seedNum;
	public int bloom;
	public int water;
	//コンストラクタ
	public Flowerbed(String color,int seedNum){
		this.color=color;
		this.seedNum=seedNum;
		this.bloom=bloom;
		this.water=water;
	}
	//メソッド
	public void drawWater(){

		System.out.println("水を汲みました");
		water=MAXWATER;
	}
	public void waterFlower(){
		bloom++;
		water--;
//		seedNum--;
		if(bloom>=seedNum){
			System.out.println("すべての花は咲いています！");
		}else if(water==0){
			System.out.println("水を汲んでください");
		}else{
			System.out.println("水を撒きました");
		}
	}
	public void showStatus(){
		System.out.println("花の色は"+color);
		System.out.print("#");
	//	for(int i=0;i<seedNum;i++){
	//	System.out.println("花の色は青+ssjkanakigo");
		for(int i=0;i<bloom;i++){
			System.out.print("*");		
		}
		for(int j=0;j<seedNum-bloom;j++){
			System.out.print(".");
		}
		System.out.print("#");
//		}
	}
}
