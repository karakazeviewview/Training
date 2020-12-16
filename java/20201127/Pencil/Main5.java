import java.util.*;
public class Main5{
	public static void main(String[] args){
		String name="山田太郎";
		char[] chars=new char[4];
		for(int i=0;i<chars.length;i++){
			chars[i]=name.charAt(i);
		}
		System.out.println(Arrays.toString(chars));
	}
}
