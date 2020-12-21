import java.util.*;
public class Random10EO{
	public static void main(String[] args){
		int[] rand=new int[10];
		String[] evenodd=new String[10];
		for(int i=0;i<rand.length;i++){
    	int n=new Random().nextInt(10);
    	System.out.print(n+",");
			rand[i]=n;
			evenodd[i]=rand[i]%2==0 ? "偶数":"奇数";
		}
		System.out.println();
		System.out.println(Arrays.toString(evenodd));
	}	
}
