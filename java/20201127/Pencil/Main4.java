import java.util.*;
public class Main4{
	public static void main(String[] args){
		System.out.print("何日間>");
		int days=new Scanner(System.in).nextInt();
		double[] weights=new double[days];
		for(int i=0;i<weights.length;i++){
			System.out.print(i+1+"日目の体重を入力>");
			double kg=new Scanner(System.in).nextDouble();
			weights[i]=kg;
		}
		System.out.println(Arrays.toString(weights));
	}
}
