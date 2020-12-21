import java.io.*;
public class Nyuryoku{
	public static void main(String[] args) throws IOException {
		System.out.println("文字列を入力してください");

		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		String str=reader.readLine();
		System.out.println(str+"が入力されました");
	}
}
