public class Lottery{
	public static void main(String[] args){
int num=new java.util.Random().nextInt(100)+1;
int sum=0;
if(num==1){
	System.out.println("1000万円");
}else if(num>=2&&num<=3){
	System.out.println("100万円");
}else if(num>=4&&num<=6){
	System.out.println("10万円");
}else if(num>=7&&num<=10){
	System.out.println("1万円");
}else if(num>=11&&num<=20){
	System.out.println("1000円");
}else if(num>=21&&num<=40){
	System.out.println("100円");
}else{
	System.out.println("ハズレ");
}
	}
}



/*
}
	for(int i=0;i<3;i++){
		int num=new java.util.Random().nextInt(100)+1;

		
	System.out.println(num);
}		
	}
}
*/
