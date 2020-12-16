import java.util.*;
public class Main7{
	public static void main(String[] args){
		System.out.print("単語を入れてね>");
		String word=new Scanner(System.in).next();
		char[] chars=new char[word.length()];
		for(int i=chars.length-1;i>=0;i--){
			chars[i]=word.charAt(i);
	
		System.out.println(chars[i]);
	}
}
}
