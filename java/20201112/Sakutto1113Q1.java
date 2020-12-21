import java.util.*;
public class Sakutto1113Q1{
	public static void main(String[] args){
		System.out.println("何人>");
		int ninzu = new java.util.Scanner(System.in).nextInt();
		int[] score=new int[ninzu];
		for(int i=0;i<ninzu;i++){
			System.out.print((i+1)+"人目の点数");			
		score[i]=new java.util.Scanner(System.in).nextInt();
		}
		System.out.println(Arrays.toString(score));
	}
}
