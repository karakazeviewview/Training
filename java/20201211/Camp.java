import java.io.*;
import java.util.*;
public class Camp{
	public static void main(String[] args)throws Exception{
		Map<String,Integer> map=new HashMap<>();
		puddt
Map<String,Integer> map=new HashMap<>();

		FileInputStream fis=new FileInputStream("data.csv");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		FileInputStream fis2=new FileInputStream("data2.csv");
		InputStreamReader isr2=new InputStreamReader(fis2,"utf-8");
		BufferedReader br2=new BufferedReader(isr2);

		System.out.println("csvデータ");
		System.out.println("-------");
		String line;
		while((line=br.readLine()) !=null){
			System.out.println(line);
			//String[] data = str.split(",", 0);
			//int i = Integer.parseInt(data[]);
		}

		System.out.println("キャンプ会計");
		System.out.println("-------");
		String line2;
		while((line2=br2.readLine()) !=null){
			System.out.println(line2);
			//String[] data2 = line2.split(",", );
			//int i2 = Integer.parseInt(data2[]);
		}
		br.close();
	}
}
