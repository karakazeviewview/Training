import java.util.*;
public class Pool{
		//フィールド変数
		double water;
		double feed;
		double drain;
		//コンストラクタ
	pucblic Pool(double water,double feed,double drain){
		this.water=water;
		this.feed=feed;
		this.drain=drain;
	}
	//メソッド
	public void feedWater(double feed){
		System.out.print(feed+"立方メートル給水しました");
		water=water+feed;
	}

	public void drainWater(double drain){
		System.out.print(drain+"立方メートル排水しました");
		water=water-drain;
	}

	public void display(){
		System.out.println("現在の水量は"+water+"立方メートルです");
	}
}
