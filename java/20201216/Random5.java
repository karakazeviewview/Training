import java.util.*;
public class Random5{
	public static void main(String[] args){
		Random rand=new Random();
		int num=rand.nextInt(11)-5;
		System.out.println(num);
	}
}
