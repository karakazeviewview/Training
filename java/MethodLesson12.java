import java.util.*;
public class MethodLesson12{
	static int[] timeArray(int[] arr, int times){
		int[] retArr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			retArr[i]=arr[i]*times;
		}
		return retArr;
	}
	public static void main(String[] args){
		int[] arr1=new int[]{1,2,3};
		int[] arr2=timesArray(arr1,2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}
}
