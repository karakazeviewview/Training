import java.util.*;
public class Rand{
	public static void main(String[] args){
		int[][]scores=new int[3][4];
System.out.println();
int rand=0;
		for(int i=0;i<scores.length;i++){
			for(int j=0;j<scores[i];j++){
				scores[i][j]=new java.util.Random().nextInt(100)+1;
				System.out.printf("%3d",scores[i][j]);
			}
			System.out.println();
		}	
	}
}
