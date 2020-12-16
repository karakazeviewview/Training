import java.util.*;
public class Array{
	public static int[] makeArray(int size){
		int[] newArray=new int[size];
		for (int i=0;i<newArray.length;i++){
			newArray[i]=i;
		}
		return newArray;
	}

	public static void main(String[] args){
		int[] array=makeArray(3);
			System.out.println(Arrays.toString(array));
	}
}
