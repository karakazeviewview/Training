import java.util.*;
public class MapTest{
	public static void main(String[] args){
		Map<String,Integer> prefs=new HashMap<String,Integer>();//宣言
		prefs.put("京都",255);//allaylistなどのaddでなくput,prefは県
		prefs.put("東京",1261);
		prefs.put("熊本",181);
		int tokyo=prefs.get("東京");//get東京で値が帰ってくる
		System.out.println("東京の人口は"+tokyo);
		//prefs.remove("京都");
		prefs.put("熊本",182);//上書きがallaylistなどのsetではなくput
		int kumamoto=prefs.get("熊本");//取り出しが面倒
		System.out.println("熊本県の人口は"+kumamoto);
		for(String key:prefs.keySet()){
			int value=prefs.get(key);
			System.out.println(key+"の人口は"+value);//keyを取り出す
		}
	}
}
