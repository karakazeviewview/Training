import java.util.*;
public class ITest{
	public static void main(String[] args){
		new A().a();//ア
		Y y=new A();//イ
		y.b();//イ
		//Y y=new A();
		((A)y).c();//ウ
		X x=new B();x.a();//エ
	}
}

interface X{
	void a();
}
abstract class Y implements X{
	public abstract void a();
	public abstract void b();
}

class A extends Y{
	public void a(){
		System.out.println("Aa");
	}

	public void b(){
		System.out.println("Bb");
	}

	public void c(){
		System.out.println("Cc");
	}
}

class B extends Y{
	public void a(){
		System.out.println("Ba");
	}

	public void b(){
		System.out.println("Bb");
	}

	public void c(){
		System.out.println("Bc");
	}
}

