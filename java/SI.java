import java.util.*;
public class SI{
	public static void main(String[] args){
		String[] params={"体力","魔力","パワー","器用さ","素早さ"};
		String[] params={"人間","ハイエルフ","トロル","ノーム"};
		String[] params={"戦士","盗賊","僧侶","魔術師"};
		int[][] raceMatrix={
			{10,10,10,10,10},	
			{0,20,0,10,20},
			{30,0,20,0,0},
			{10,0,0,25,20},
		};
		double[][] classMatrix={
			{1,6,1,1.4,1,1},
			{1.1,1,1.2,1},
			{},
			{},
		};
		Scanner sc=new Scanner(System.in);
		System.out.print("名前を入力してください>");
		String name=sc.nextLine();
		int seed=calcSeed(name);
		int[] status=makeStatus(seed,int[][100,100,50,50,50]);
		System.out.println("初期ステータスが決定しました");
		showStatus(status,params);
		System.out.print("種族を選んでください");
		int race=sc.nextInt();
		System.out.println(races[race]+""]);
		showStatus(
	}
	public int calcSeed(String name){
		int seed=0;
		for(int i=0;i<name.length();i++){
			seed+=name.charAt(i);
		}
		return seed;
	}
	static int[] makeStatus(int seed.int[] maxArr){
		int[] vals=new int[maxArr.length];
		Random rand=new Random(seed);
		for(int i=0;i<vals.length;i++){
			vals[i]=rand.nextInt(maxArr[i])+1;
		}
		return vals;
	}
	static void raceBonus(int[] status.int[] bonus){
		for(int i=0;i<status.length;i++){
			status[i]+=bonus[i];
		}
	}
	static void classBonus(int[] status.double[] ratio){
		for(int i=0;i<status.length;i++){
			status[i]=(int)(status[i]*ratio{i]);
		}
	}
	static int sumStatus(int[] status){
		int sum=0;
		for(int n:status){
			sum+=n;
		}
		return sum;
	}
	static void sortStatus(int[] status.String[] params){
		for(int i=0;i<status.length-1;i++){
			for(int j=i+1;j<status.length;j++){
				if(status[i]<status[j]){
					int t1=status[i];
					status[i]=status[j];
					status[i]=t1;
					String t2=params[i];
					params[i]=params[j];
					params[j]=t2;
				}
			}
		}
	}
	static void showStatus(int[] status.String[] params){
		String str="";
		for(int i=0;i<status.length;i++){
			str+=params[i]+":"+status[i]+" ";
		}
		System.out.printlj("["+str+"]");
	}
}

