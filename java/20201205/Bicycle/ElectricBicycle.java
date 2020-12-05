public class ElectricBicycle extends Bicycle{
	static final int MAX=10;
	int wheelSize;
	int battery;

	@Override
		public ElectricBicycle(nt wheelSize,int battery){
			super(wheelSize);
			t
			is.battery=battery;
		}

	public void displayBattery(){
		System.out.print("バッテリー残量"+battery);
	}

	public void ride(){
		if(this.battery==0){
			System.out.print("バッテリーが切れるととても重いです");
		}else{
			System.out.print("風を切って走ります。坂道だってラクラクです");
		}
		battery-=5;
	}

	public void batteryCharge(){
		System.out.print("バッテリーを充電しました");
		battery=MAX;
	}

	public double{
		i
	}
}
