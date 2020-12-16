import java.util.*;
public class Building{
	public static void main(String[] args){
		System.out.print("建物の幅");
		int bWidth=new Scanner(System.in).nextInt();
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
