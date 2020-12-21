public class TScore{
	public static void main(String[] args){
		int[] testScore=new int[3];
		testScore[0]=83;
		testScore[1]=54;
		testScore[2]=98;
		// int [] testScore = {83,54,98};

		int sumTestScore=sum(testScore[0],testScore[1],testScore[2]);

		System.out.println("今回のテストの合計点は"+sumTestScore);

		int maxTestScore=max(testScore);

		System.out.println("最高点は"+maxTestScore);

		double aveTestScore=ave(testScore[0],testScore[1],testScore[2]);

		System.out.println("平均点は"+aveTestScore+"です");
	}

	public static int sum(int a,int b, int c){
		int sum=a+b+c;
		return sum;
	}

	public static int max(int[] testScore){
		//配列の最大値が0の場合もあるため、配列の要素の1番目で初期化すること
		int maxTestScore = testScore[0]; 
		//要素0番目のは代入済みのため1番目から開始する
		for(int i=1;i<testScore.length;i++){
			//intMaxに代入されている値と配列の要素を比較して、配列の要素のほうが大きい場合値を上書きする.
			if(maxTestScore < testScore[i]) {
				maxTestScore= testScore[i];
			}
		}
		return maxTestScore;
	}

	public static int ave(int a,int b,int c){
		int ave=(a+b+c)/3;
		return ave;
	}
}





