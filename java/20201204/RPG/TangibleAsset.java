public abstract class TangibleAsset extends Asset{
	String namep;
	int pricep;
	String color;
	double weight;
	public TangibleAsset(String name,int price,String color,double weight){
			super(name,price);
			this.color=color;
			this.price=price;
			this.weight=weigth;
	}

	public String getColor(){
		return this.color;
	}

	@Override
	public double getWeight(){
		return this.weight;
	}

	@Override
	public void setWeight(double weight){
		this.weight=weight;
	}
}
