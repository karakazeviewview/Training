package Hit;
import java.util.Arrays;
public class reverse {
	public static void main(String[] args) {
		int scan=new java.util.Scanner(System.in).nextInt();
		int[] arr=new int[scan.length];
		for(int i=0;i<scan.length;i++) {
			for(int j=0;j<i;j++) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		}
}
