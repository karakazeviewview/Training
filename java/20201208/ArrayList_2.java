import java.util.*;
public class ArrayList_2{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<>();
		names.add("John");
		names.add("Paul");
		names.add("George");
		//for(int i=0;i<names.size();i++){
		//System.out.println(names.get(i));
		for(String s:names){
			System.out.println(s);
		}
	}
}
