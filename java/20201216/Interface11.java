import java.util.*;
public class Interface11{
	public static void main(String[] args){
		
	}
}

public class Book extends TangibleAsset{
//	String name;
//	int price;
//	String color;
	String isbn;
	//メソッド
	public Book(String name,int price,String color,String isbn){
//		this.name=name;
//		this.price=name;
//		this.color=color;

		super(name,price,color);
		this.isbn=isbn;
	}
	//メソッド
	/*
	public String getName(){
		return this.name;
	}

	public int getPrice(){
		return this.price;
	}

	public String getColor(){
		return this.color;
	}
*/
	public String getIsbn(){
		return this.isbn
	}
}
/*
public class Computer{
	String name;
	int price;
	String color;
	String makerName;
	//コンストラクタ
	public Computer(String name,int price,String color,String mekerName){
		this.name=name;
		this.price=price;
		this.color=color;
		this.makerName=makerName;
	}
	//メソッド
	public String getName(){
		return this.name;
	}

	public int getPrice(){
		return this.price;
	}

	public String getColor(){
		return this.color;
	}

	public String getMakerName(){
		return this.mekerName;
	}
*/


	public class Computer extends TangibleAsset{
		String makerName;
		public Computer(String name,int price,String color,String makerName){
			super(name,price,color);
			this.makerName=makerName;
		}
		public String getMakerName(){
			return this.makerName;
	}
}

/*
public class TangibleAsset{
	String name;
	int price;
	String color;
	public TangibleAsset(String name,int price,String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}

	public String getName(){
		return this.name;
	}

	public int getPrice(){
		return this.price;
	}

	public String getColor(){
		return this.color;
	}
}
*/

public class TangibleAsset{
	
}
