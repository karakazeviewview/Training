import java.util.*;
public class MethodJisaku5{
	public static void main(String[] args){
		int b=new Scanner(System.in).nextInt();
		int max=maxOf(a,b);
		System.out.println("大きい方は"+max);

	System.out.println (decorateStr("Hello",2));
	System.out.println (decorateStr("Hello",1));

		
	}
	Static int maxOf(int a,int b){
		return a>b ? a:b;
	}
	static String decorateStr(String str, int num){
		if(num % 2==0){
			return "***"+str+"***";
		}else{
			return "---"+str+"---";
		}
	}
}
