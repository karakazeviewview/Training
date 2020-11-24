import java.util.*;
public class Kakezan{
  public static void main(String[] args){ 
 		System.out.print("n(1~9)?>");
		int scnum=new Scanner(System.in).nextInt();
		int[][] kuku=new int[scnum][9];
		for(int i=0; i<kuku.length; i++){
      for(int j=0; j<9; j++){
				kuku[i][j]=(i+1)*(j+1);
      //System.out.print(i*j + "| ");
					if(j==8){
						System.out.printf("%3d",kuku[i][j]);
					}else{
						System.out.printf("%3d|",kuku[i][j]);
      		}		
    	}
   	 System.out.println(); 
  	}
	}
}    

        
  














