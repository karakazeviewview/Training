import.util.java.Arrays;
public class ArrLesson33{
	public static void main(String[] args){
		int[] dataA=new int[] {3,5,10};
		int[] dataB=new int[] {4,6,10};
		for(int i=0;i<dataA.length;i++){
			System.out.println(dataA[i]);
		//	for(int i:dataA){
			//	System.out.println(i);
		}
		for(int n=0;n<dataB.length;n++){
				System.out.println(dataB[n]);
	//	for(int n:dataB){
		//	System.out.println(n);
		}
		System.out.println(Arrays.toString(dataA));
	}
}
