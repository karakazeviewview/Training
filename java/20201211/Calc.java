import java.util.*;
public class Calc{
	public static int tasu(int a,int b){
		return a+b;
	}

	public static int hiku(int a,int b){
		return a-b;
	}

	public static void main(String[] args){
		int total=tasu(20,10);
		int delta=hiku(20,10);
		System.out.println(total+"と"+delta);
	}
}
