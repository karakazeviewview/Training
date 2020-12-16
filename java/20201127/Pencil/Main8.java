import java.util.*;
public class Main8{
	public static void main(String[] args){
		System.out.print("何回サイコロをふる>");
		int num=new Scanner(System.in).nextInt();
		boolean[] isEven=new boolean[num];
		for(int i=0;i<isEven.length;i++){
			int dice=new Random().nextInt(6)+1;
			System.out.println(dice);
			if(dice%2==0){
				isEven[i]=true;
			}else{
				isEven[i]=false;
			}
		}
		System.out.println(Arrays.toString(isEven));
	}
}
