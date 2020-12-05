public class Cat extends Animal{
	public Cat(String name){
		super(name);
	}
	@Override
	public void makeNoise(){
		System.out.println(this.name+"はにゃんと鳴いた");
	}

	public void sleep(){
		System.out.println(this.name+"はコタツでおやすみzzzz...");
	}
}
