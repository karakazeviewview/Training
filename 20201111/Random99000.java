import java.util.*;
public class Random99000{
	public static void main(String[] args){
		int[] rand=new int[100];
		for(int i=0;i<rand.length;i++){
		rand[i]=new java.util.Random().nextInt(100);
		System.out.println(rand[i]);
		if(rand[i]==77){
			System.out.println("最初の77のindexは"+i+"です");
			break;
			}else{
				System.out.println("77はありませんでした");
			}
		}
	}
}
