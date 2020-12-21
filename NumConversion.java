import java.io.*;
public class NumConversion {
	public static void main(String[] args) throws IOException{
		System.out.println("整数を入力してください");

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		String str=reader.readLine();
		//入力した文字列を数値に変換
		int num=Integer.parseInt(str);
		System.out.println(num+"が入力されました");
	}
}
	
