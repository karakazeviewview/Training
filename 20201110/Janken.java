import java.util.*;
public class Janken{
	public static void main(String[] args){
		String[] hands={"グー","チョキ","パー"};
		System.out.println("手を入力0.グー、1.チョキ、2.パー>");
		int userHand=new Scanner(System.in).nextInt();
		int pcHand=new Random().nextInt(hands.length);			
		System.out.printf("pcは%s%n",hands[pcHand]);
		int diff=(userHand+3-pcHand)%3;
		if(diff==0){
			System.out.println("あいこです");
		}else if(diff==1){
			System.out.println("あなたの負けです");
		}else{
			System.out.println("あなたの勝ちです");
		}
		/*
		if(userHand==pcHand){			
		}else if(userHand==0&&pcHand==1
		|| userHand==1&&pcHand==2
		|| userHand==2&&pcHand==0){
		}else{
		}
		*/
	}
}








/*
int user=new java.util.Scanner(System.in).nextInt();
int index=new java.util.Random().nextInt(2);
if(user=0&&pc=1){
   System.out.println("");
}else if(user=1&&pc=2){
   System.out.println("");
}else if(user=2&&pc=0){
   System.out.println("");
 
}else if()
*/
