import java.util.*;
public class Prefecture{
	public static void main(String[] args){
	  Set<String> set = new HashSet<>();
    set.add("Texas");
    set.add("Washington");
    set.add("California");
    set.add("Hawaii");

    if(set.contains("California")){
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }

    for(String s : set){
      System.out.println(s);
    }
	}
}
