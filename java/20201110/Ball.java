/*
import java.util.*;
public class Ball{
	public static void main(String[] args){
		int[] Ball={1,2,3,4,5};
		Ball=Random().nextInt(5)+1;
		for(int n:Ball){
			System.out.println(n);
		}
	}
}
*/

/*
import java.util.*;
public class Ball{
	public static void main(String[] args){
		int[] nums={1,2,3,4,5};
		int[] trash=new int [nums.length];
		for(int i=0;i<5;i++){				
			int rand=new Random().nextInt(nums.length);
if()}	
System.out.println(Arrays.toString(nums));
	
}
}
*/

import java.util.*;
public class Ball{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		boolean isPicked={false,false,false,false,false};
		for(int i=0;i<5;i++){
			while(true){			
			int index=new Random().nextInt(balls.length);
			if(isPicked[index]){
				continue;
			}
			System.out.println(balls[index]);
			isPicked[index]=true;
			break;
			}
		}
	}
}
