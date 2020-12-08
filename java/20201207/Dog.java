public class Dog{
	public static int count=0;
	private int id;
	private String name;
	private int age;
	private double weight;

	//コンストラクタはクラス名と同じ！
	public Dog(String name){
		this.setName(name);
		count++;
		this.setId(count);
	}

	public Dog(String name,int age){
		this(name);
		this.setAge(age);
	}

	public Dog(String name,int age,double weight){
		this(name);
		this.setAge(age);
		this.setWeight(weight);
	}

	public void agePlus(){
		this.setAge(this.getAge()+1);
	}

	public void bow(){
		System.out.println(this.name+"は吠えた");
	}

	public void getId(){
		return this.id;
	}

	public void setId(int id){
		this.id=id;
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public double getWeight(){
		return this.weight;
	}

	public String setName(String name){
		this.name=name;
	}

	public int setAge(int age){
		if(age<0){
			this.age=0;
		}else{
			this.age=age;
		}
	}

	public double setWeight(double weight){
		if(weight<0){
			this.weight=0d;
		}else{
			this.weight=weight;
		}
	}

}
