import java.util.*;
public class Days{
	public static void main(String[] args){
		days();
	}
	static int days(){
		System.out.print("月を入力してください>");
		int month=new java.util.Scanner(System.in).nextInt();
		if(month==2){
			System.out.println(month+"月の日数は28日です。");
		}else if(month%2==0){
			System.out.println(month+"月の日数は31日です。");
		}else{
			System.out.println(month+"月の日数は30日です。");
	}
	return month;
}
}
