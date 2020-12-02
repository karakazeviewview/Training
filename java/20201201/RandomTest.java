import java.util.*;
public class RandomTest{
	public static void main(String[] args){
		Random rand=new Random(1);
		for(int i=0;i<3;i++){
			System.out.println(rand.nextInt(100));
		}
  }	
}
