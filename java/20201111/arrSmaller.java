import java.util.*;
public class arrSmaller{
	public static void main(String[] args){
		int[] smaller=new int[10];
		for(int i=0;i<smaller.length;i++){
			int n=new Random().nextInt(10);
			smaller[i]=n;
		}
		System.out.println(Arrays.toString(smaller));

		for(int i=0;i<smaller.length;i++){
			for(int j=i+1;j<smaller.length;j++){
				if(smaller[i] < smaller[j]){
					int temp=smaller[i];
					smaller[i]=smaller[j];
					smaller[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(smaller));
	}
}
