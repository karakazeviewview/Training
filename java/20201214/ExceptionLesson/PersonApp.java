import java.util.*;
public class PersonApp{
	public static void main(String[] args){
		Person p=new Person();
		p.setAge(-128);
	}
}
	class Person{
		int age;
		
		public void setAge(int age){
			if(age<0){
				throw new IllegalArgumentException("年齢は正の数を入力すべきです"+age);
			}
			this.age=age;
	}
}
