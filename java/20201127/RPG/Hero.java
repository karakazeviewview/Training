public class Hero{
	String name;//フィールド(パラメータ、属性)
	int hp=100;
	
	public Hero(String name){
		this.name=name;
	}
	public Hero(String name,int hp){
		this(name);
		this.hp=hp;
	}
	public void sleep(){
		this.hp=100;
		System.out.println(this.name+"は、眠って回復した");
	}
	public void sit(int sec){
		this.hp+=sec;
		System.out.println(this.name+"は"+sec+"秒座った");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip(){
		this.hp-=5;
		System.out.println(this.name+"は5のダメージ");
	}
	public void run(){
		System.out.println(this.name+"は逃げ出した");
		System.out.println("GameOver");
		System.out.println("最終HPは"+this.hp+"でした");
	}
}
