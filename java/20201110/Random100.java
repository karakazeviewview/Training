//import java.util.*;
public class Random100{
	public static void main(String[] args){
		int[] nums=new int[5];	
		for(int i=0;i<nums.length;i++){
		nums[i]=new java.util.Random().nextInt(101);		
		System.out.println("nums:["+i+"]"+nums[i]);	
 		}
	}
}


/*
import java.util.*;
public class Random100{
	public static void main(String[] args){
	Random rand=new Random();
	int[] nums=new int[5];
	for(int i=0;i<nums.length;i++){
		nums[i]=rand.nextInt(101);
		}
		for(int i=0;i<nums.length;i++){
			System.out.println("nums:["+i+"]"+nums[i]);
			}
	}	
}
*/
