import java.util.*;

public class Email{
	public static void email(String text,String title,String address){
		System.out.printf("%sに、以下のメールを送信しました%n件名:%s%n本文:%s%n",address,title,text);
	}

	public static void main(String[] args){
		email("メールの本文","メールのタイトル","メールのアドレス");
	}

}
