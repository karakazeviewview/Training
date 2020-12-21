import java.util.*;
public class RandomDice{
	public static void main(String[] args){
		int[] dice=new int[10];
		for(int i=0;i<10;i++){
			dice [i]=new Random().nextInt(6)+1;
		}
		System.out.println(Arrays.toString(dice));
	}
}





