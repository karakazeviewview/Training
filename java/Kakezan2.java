import java.util.*;
   public class Kakezan2{
     public static void main(String[] args){
       System.out.print("n(1~9)?>");
       int scnum=new Scanner(System.in).nextInt();
       int[][] kuku=new int[scnum][9];
       for(int i=0; i<kuku.length; i++){
         for(int j=0; j<9; j++){
           kuku[i][j]=(i+1)*(j+1);
					 if(j==8){
             System.out.println(kuku[i][j]);
					 }else if((i*j)<10){
						 System.out.print(" "+kuku[i][j]+"|");
					 }else{
						 System.out.print(kuku[i][j]+"|");
           }
         }
         System.out.println();
       }
     }
   }
