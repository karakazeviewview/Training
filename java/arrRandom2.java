import java.util.*;
public class Overload{
	public static void main(String[] args){
		int[] arr1=createRandomArr(1,9,3);
		System.out.println(Arrays.toString(arr1));
	}

	static int[][] createRandomArr(int min,int max,int len,int childLen){
		Random rand=new Random();
		int[][] arr=new int[len][childLen];
		for(int i=0;i<arr.length;i++){
			for(int j=0;arr.length;i++){
				arr[i][j]=rand.nextInt(max-min+1)+min;
			}
	static int[][] createRandomArr(int min,int max,int len,int childLen){
		Random rand=new Random();
		int[][] arr=new int[len][childLen];
		for(int i=0;i<arr.length;i++){
			for(int j=0;arr.length;i++){
				arr[i][j]=rand.nextInt(max-min+1)+min;
			}
		}
		return arr;
	}
}
