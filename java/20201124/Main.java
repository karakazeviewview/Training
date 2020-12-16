import java.util.*;
public class Main{
	public static void main(String[] args){
	  //プレイヤー作成
    System.out.print("何人>");
    int personNum=new Scanner(System.in).nextInt();
    char[] players= new char[personNum.length];
    //プレイヤーごとの合計点を管理する配列
    int[] sums=new int[players.length];
    //ダイスの目作成
    System.out.print("何回ふる>");
    int count=new Scanner(System.in).nextInt();
    for(int i=0;i<players.length;i++){
      int[] diceArr= new int[players.length];
      for(int n:diceArr){
        ##
      
	}
	static int[] createDicdArr(int count){
		int[] diceArr=new int[count];
		for(int i=0;i<diceArr.length;i++){
			diceArr[i]=new Random().nextInt(6)+1;
		}
		return diceArr;
	}
	static char[] createArr(char first,int num){
		char[] alphArr=new char[num];
		for(int i=0;i<alphArr.length;i++){
			alphArr[i]=(char)(first+i);
		}
		return alphArr;
	}
	static boolean isSame(int[] nums){
		int first=nums[0];
		for(int i=1;i<nums.length;i++){
			if(first != nums[i]){
				return false;
			}
		}
		return true;
	}
	static int maxNum(int[] nums){
		int max=nums[0];
		for(int i=1;i<nums.length;i++){
			if(nums[i] >max){
				max=nums[i];
			}
		}
		return max;
	}
}
