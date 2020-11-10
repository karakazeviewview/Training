public class Ball2{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		for(int i=0;i<5;i++){
			while(true){
				int index=new Random().nextInt(galls.length);
				if(balls[index]==0){
					continue;
				}
				System.out.println(balls[index]);
				balls[index]=0;
				break;
			}
		}
	}
}
