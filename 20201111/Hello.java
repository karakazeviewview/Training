import java.util.*;
public class Hello{
	public static void main(String[] args){
		char[] hello =new char[]{'H','E','L','L','O'};
/*
for(int i=hello.length-1;i>=0;i--){
			System.out.print(hello[i]);
	*/
	for(int i=0;i<hello/2;i++){
	int temp=hello[i];
	hello[i]=hello[hello.length-i-1];
	System.out.print(Arrays.toString());
	}
	}
}
