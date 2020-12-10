import java.util.*;
public class Cat2{
	static final String[] types={"A","B","C"};
	String type;
	Stirng name;
	int intimacy;
	public Cat2(){
		int character=new Random().nextInt(types.length);
		this.type=types[character];//typesのランダム番目
		System.out.printf("%s-type cat appeared!%n",this.type);//猫のタイプを出力
		this.setName();//セッターメソッド呼び出し
	}

	public void setName(){
		System.out.print("Please name this cat>");
		this.name=new Scanner(System.in).next();
		System.out.printf("%s jointed!%n",this.name);
	}

	public void catPlay(){
		System.out.printf("Playing with %s%n",this.name);
		System.out.println("...");
		System.out.println("Intimacy is up!");
		this.intimacy++;
	}

	public String getName(){
		return this.name;
	}

	public int getIntimacy(){
		return this.intimacy;
	}

	public String getType(){
		return this.type;
	}
}
