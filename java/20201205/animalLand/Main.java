import java.util.*;
public class Main{
	public static void main(String[] args){
		Animal[] animals=new Animal[3];
		Animal[] animals={Dog("ジョン"),Cat("ミケ"),Pig("サム")};
		/*
		animals[0]=new Dog("ジョン");
		animals[1]=new Cat("ミケ");
		animals[2]=new Pig("サム");
		*/
		for(Animal a:animals){
			a.makeNoise();
	//		if(a instanceof Cat){
				((Cat)a).sleep();
			}
		}
	/*
	  Cat mike=(Cat)animals[1];
	  mike.sleep();
	  ((Cat)animals[1]).sleep();
	 */
	}

