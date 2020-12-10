import java.util.*;
public class Box{
	private String color;
	private String shape;
	private int num;
	private static int totalNumber;
	private static int count;
	private int no;

	public Box(String color,String shape,int num){
		this.color=color;
		this.shape=shape;
		this.num=num;
		this.totalNumber+=num;
		this.boxNum(count);
		count++;
	}

	public void boxNum(int no){
		this.no=no;
	}
	public void insertBalls(int ball){
		System.out.printf("%d個のボールを入れました。%n",ball);
		this.num+=ball;
		this.totalNumber+=ball;
	}

	public void removeBalls(int ball){
		if(this.num>ball){

			System.out.printf("%d個のボールを取り出しました。%n",ball);
			this.num-=ball;
			this.totalNumber-=ball;
		}else{
			System.out.printf("%d個のボールを取り出しました。%n",this.num);
			this.num=0;
		}

	}

	public void displayInfo(){
	}

	static void displayTotalNumber(){
		System.out.printf("ボールの合計は%d個です。%n",totalNumber);
	}

	@Override
		public String toString(){
			return String.format("%d---色:%s,形:%s,個数:%d%n",this.no,this.color,this.shape,this.num);
		}





}
