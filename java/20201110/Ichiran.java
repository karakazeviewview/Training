import java.util.*;
public class Ichiran{
	public static void main(String[] args){
		System.out.print("何人>");
		int zenin=new java.util.Scanner(System.in).nextInt();
		int[] score=new int[zenin];
		for(int i=0;i<zenin;i++){
			System.out.print((i+1)+"人目の点数>");
			score[i] =new java.util.Scanner(System.in).nextInt();
			}			
			System.out.println(Arrays.toString(score));
	}
}
 
