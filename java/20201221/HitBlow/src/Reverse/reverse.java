package Reverse;
import java.util.Arrays;

  public class reverse {

	public static void main(String[] args) {
		int scan=new java.util.Scanner(System.in).nextInt();
		int[] arr=new int[scan.length];
		//int[] arr= {1,2,3,4};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		}
	}
}
/*
public class reverse{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100]; // 配列確保（大きめに）
		int n = 0; // データ数
		// データ入力
		while (sc.hasNext()) {
			a[n] = sc.nextInt();
			n++;
		}
		// 並べ替え（バブルソート）
		for (int i = n; i >= 2; i--) {
			for (int j = 1; j < i; j++) {
				if (a[j-1] > a[j]) {
					int w = a[j];
					a[j] = a[j-1];
					a[j-1] = w;
				}
			}
		}
		// aの内容を表示
		for (int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
	}
}
*/