import java.util.*;
public class SManipu{
	public static void main(String[] args){
		String s1="スッキリJava";
		String s2="Java";
		String s3="java";
		if(s2.equalsIgnoreCase(s3)){
			System.out.println("s2s3はケースを無視すれば等しい");
		}
		//文字列から文字を1文字ずつ取り出しながら縦に出力する。
		for(int i=0;i<s1.length();i++){
			System.out.println(s1.charAt(i));
		}
		if(s1.isEmpty()){
			System.out.println("文字列s1Javaを含んでいます");
		}
		if(s1.endsWith("Java")){
			System.out.println("文字列s1はJavaが末尾にあります");
		}
		System.out.println("文字列s1で最初にJavaが登場する位置は"+s1.indexOf("Java"));
		System.out.println(s1.substring(2,3));
		System.out.println(s1.substring(6));

		//文字列を巻まで分割
		String s4="java,ruby,php";
		String[] data=s4.split(",");
	}
}
