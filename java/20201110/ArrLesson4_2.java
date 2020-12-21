import java.util.Arrays;
   public class ArrLesson4_2{
 		 public static void main(String[] args){
       int[] arrA={4,8,10};
       int[] arrB=new int[]{7,1,3};
    	 for(int i=0;i<arrA.length;i++){
         System.out.println(arrA[i]);
       }
			 for(int n:arrB){
				 System.out.println(n);
			 }
			 int[] arrC=new int[3];
			 for(int j=0;j<arrC.length;j++){
				 arrC[j]=arrA[j]*2;
				 System.out.println(Arrays.toString(arrC));
			} 
			 for(int k=0;k<arrC.length;k++){
				 arrC[k]=arrC[k]+arrB[k];
     
		 System.out.println(arrC[k]);
  }int sum=0;
	for(int o:arrC){
sum=sum+o;
	System.out.println(o);
}
System.out.println("合計は"+sum+"です。");
	}
}
