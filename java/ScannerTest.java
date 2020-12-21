import java.util.*;
public class ScannerTest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("好きな数字は>");
		int num=sc nextInt():sc.nextLine();
		System.out.print("お名前");
		String name=sc.nextLine();
		System.out.println(name+"が好きな数字は"+num+"です");
		/*
		int num2=new Scanner(System.in).nextInt();
		int num3=new Scanner(System.in).nextInt();
		System.out.print("num:"+num);
		System.out.print("num2:"+num2);
		System.out.print("num3:"+num3);
		/*
		System.out.print("お名前>");
		String name=new Scanner(System.in).nextLine();
		System.out.println(name+"さんの好きな数字は"+num+"ですね！");
		*/
	}
}
