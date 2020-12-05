public class Pig extends Animal{
	public Pig (String name){
		super(name);
	}
	@Override
	public void makeNoise(){
		System.out.println(this.name+"はブーブーと鳴いた");
	}
}
