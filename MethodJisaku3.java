import java.util.*;
public class MethodJisaku3{
	public static void main(String[] args){
		int n=sumOf(3,5);
		System.out.println(n);
		System.out.print("言葉>");
		String str=new Scanner(System.in).next();
		String decorated=decorateStr(str);
		System.out.println(decorated);
	}
		static int sumOf(int a,int b){
			return a+b;
		
		
	
	}
	static String decorateStr(String s){
		
		return "***"+s+"***";


	}
}
