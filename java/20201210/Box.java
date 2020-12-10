import java.util.*;
public class Box{
	private String color;
	private String shape;
	private int num;
	private static int totalNumber;
}

//コンストラクタはクラス名と同じ
public Box(String color,String shape,int num){
	this.color=color;
	this.shape=shape;
	this.num=num;
	this.totalNumber=totalNumber;
}

//以下いくつかのメソッドたち
public insertBalls(){
}

public removeBalls(){
}

public displayInfo(){
}

public displayTotalNumber(){
}


public class BoxApp{
	System.out.print(1. ボール投入 / 2. ボール取出 / 3. ボール総数表示 / 4. 終了>){

	}
}









/*
フィールドに、箱の色String color,はこの形String shape,はこの中のボールの数int num,全ての箱のボールの総数static int totalNumberを書く。
コンストラクタ と引数,public Box(String color,String shape,int num)を書く。
メソッド として、
insertBalls引数として渡された個数のボールを箱に入れる、
removeBalls引数として渡された個数のボールを箱から取り出すかつ個数が不足する場合は全てのボールを取り出す,
displayInfo箱の色、形、ボールの数を表示,
static displayTotalNumber全てのボールの総数を表示。

boxAppクラスを作り、「赤、円形、1」「青、四角、2」でBoxクラスのインスタンスを2つnewする。
*/
