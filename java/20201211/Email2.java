import java.util.*;
public class Email2{
	public static void email2(String address,String title){
		System.out.println(address+title);
	}

	public static void email2(String text){
		System.out.println(text);
	}

	public static void main(String[] args){
		email2("アドレス","タイトル");
		//email2("本文");
	}
}
