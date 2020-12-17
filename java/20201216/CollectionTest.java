import java.util.*;
public class CollectionTest{
	public static void main(String[] args){
		List<Integer> list=new ArrayList<>();
		//要素追加
		list.add(100);
		list.add(200);
		//リストの要素を全て出力
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		//最初の要素を500に変更
		list.set(0,500);

		Set<String> set=new HashSet<>();
		//要素追加
		set.add("mp3");
		set.add("wav");

		if(set.contains("mp3")){
			System.out.println("setはmpsを含んでいます");
	}
	//setの要素を0にする。
	set.clear();

	Map<String,Integer> map=new HashMap<>();
	map.put("Jan",1);
	map.put("Feb",2);

	if(map.containsKey("Jan")){
		System.out.println("mapはキーにJanを含んでいます");
	}

	//全て出力
	for(String en:map.keySet()){
		System.out.printf("%sは%d月です%n",en,map.get(en));
	}
}
}
