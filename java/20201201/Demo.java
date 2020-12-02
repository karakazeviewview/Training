public class Demo{
	public static void main(String[] args){
		int ?=new Random().nextInt();
		int[][] bc={
			{0,1,2},{3,4,5},{6,7,8},
			{0,3,6},{1,4,7},{2,5,8},
			{0,4,8},{2,4,6}
		};
		int bingo=0;
		for(int i=0;i<bc.length;i++){
			int[] c= bc[i];
			if(c[0]==1&&c[1]==2){
				bingo++;
			}
		}
		System.out.println(bingo);
	}
}

