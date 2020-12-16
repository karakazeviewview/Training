import java.util.*;
public class Main6{
	public static void main(String[] args){
		System.out.print("単語を入れてね>");
		String word=new Scanner(System.in).next();
		char[] chars=new char[word.length()];
		for(int i=0;i<chars.length;i++){
			chars[i]=word.charAt(i);
		}
		System.out.println(Arrays.toString(chars));
	}
}
