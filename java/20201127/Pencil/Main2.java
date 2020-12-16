import java.util.*;
public class Main2{
	public static void main(String[] args){
		System.out.print("要素数>");
		int num=new Scanner(System.in).nextInt();
		int[] nums=new int[num];
		for(int i=0;i<nums.length;i++){
		nums[i]=i+1;
		}
		System.out.println(Arrays.toString(nums));
	}

}
