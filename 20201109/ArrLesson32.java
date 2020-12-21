import java.util.Arrays;
public class ArrLesson32{
	public static void main(String[] args){

		int[] dataA={3,5,10};
		int[] dataB=new int[] {4,6,10};
//		for(int i=0;i<3;i++){
	//System.out.println(dataA[i]);
	for(int n:dataA){
			System.out.println(n);
			}
//			for(int n:dataB){
	//			System.out.println(n);
		for(int n=0;n<3;n++){
			System.out.println(dataB[n]);
		}
			System.out.println(Arrays.toString(dataA));
	}
}
