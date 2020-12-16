import java.util.*;
public class Demo{
	public static void main(String[] args){
ArrayList<String> names=new ArrayList<>();
		names.add("JohnYoko");
		names.add("Paul");
		names.add("George");

		System.out.println(names.get(0));
		System.out.println(names.size());
		for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}
		for(String s:names){
			System.out.println(s);
		}
		names.remove(0);
		for(int i=0;i<names.size();i++){
		System.out.println(names.get(i));
		System.out.println(names.size());
		names.add(2,"John");
		for(i=0;i<names.size();i++){
		System.out.println(names.get(i));
		names.remove("Paul");
		names.remove("JohnYoko");
		names.remove("George");
		names.remove("John");
		names.add("Joe");
		if(names.isEmpty()){
			System.out.println("要素はありません");
		}
		if(names.contains("Paul")){
			System.out.println("Paulを含みます");
		}
		System.out.println(names.get(i));
	}
}
}
}
