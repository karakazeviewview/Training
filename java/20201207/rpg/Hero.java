public class Hero
	static int money;
	private String name;
	private int hp;
	Sword sword;

	public void bye(){
		System.out.println("勇者は別れを告げた");
	}

	public void die(){
		System.out.
	}

	//コンストラクタ
	public Hero(String name){
		this.setName(name);
	}

	public String getName(){
		return this.name;
	}

public int getHp(){
	return this.hp;
}
	public Hero(String name,int hp){
		this(name);
		this.setHp(hp);

	public void setName(String name){
		this.name=name;
	}
	}

	public void setHp(int hp){
		this.hp=hp;
	}

	public void attack(){
		System.out.println("戦闘に勝利した");
		money+=10;
		this.hp-=new java.util.Random().nextInt(10)+1;
	}
}
