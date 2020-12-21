importz java.util.*;
public class Game5W{
	public static void main(String[] args){
		String []question=new String[]{"いつ","誰が","どこで","何をした"};
		String [][]data=new String[][];
		for(int i=0;i<question.length;i++){
			System.out.print(question[i]+"はいくつ？>");
			int kaisu=new Scanner(System.in).nextInt();
			for(int j=0;j<kaisu)
	}

/*
		int itsu=new java.util.Scanner(System.in).nextInt();
		int [][]data=new int[itsu][];
		System.out.println();
		for(int i=0;i<data.length){
			System.out.print("誰が"+(i+1)+"はいくつ？>");
			int dare=new java.util.Scanner(System.in).nestInt();
			data[i]=new int[dare];
      for(int j=0;j<data[i].length;j++){
				System.out.print(j+1+"どこではいくつ？>");
        int score=new Scanner(System.in).nextInt();
        data[i][j]=score;
				for(int k=0;k<;k++){
				 	System.out.print(j+1+何をしたはいくつ？>");
				 	int score=new Scanner(System.in).nextInt();
					data[i][j]=score;
					}	
				}
			}*/
		 	System.out.println("");
      for(int i=0;i<data.length;i++){
        for(int j=0;j<data[i].length;j++){
          System.out.printf("%4d",data[i][j]);
        }
        System.out.println();
		}
	}
}
