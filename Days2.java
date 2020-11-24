import java.util.*;
public class Days2{
	public static void main(String[] args){
	System.out.print("月を入力してください。>");
	int month=new java.util.Scanner(System.in).nextInt();
		month(d28,d31,d30);
//		Systemout.print.out(m1+"月の日数は日です。");
//		Systemout.print.out(m2+"月の日数は日です。");
//		Systemout.print.out(m3+"月の日数は日です。");
		
	}
	static int month(d28,d31,d30){
		if(month==2){
			return d28;
		}else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
			return d31;
    }else{
			return d30;
    }
  }
}                         
