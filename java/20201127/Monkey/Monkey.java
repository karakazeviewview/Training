public class Monkey{
	String name;
	int age;

	public Monkey(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void greet(){
		System.out.println("こんにちは"+this.name+age+"です。よろしく！");

	}
	public void takeuma(){
		System.out.println(name+"は上手に竹馬に乗った");
	}
	public void sakadachi(){
		System.out.println(name+"はひょいと逆立ちをした!");
	}
	
}
