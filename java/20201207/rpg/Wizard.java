public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	public void heal(Hero h){
		int basePoint=10;
		int recovPoint=(int)(basePoint*this.getWand().getPower());
		h.selfHp(h.getHp()+recovPoint);
		System.out.println(h.getName()+"のHPを"+recovPoint+"回復した");
	}

	public int getHp(){
		return this.hp;
	}

	public void setHp(int hp){
		if(hp<0){
			this.hp=0;
		}else{
			this.hp=hp;
		}
	}

	public int getMp(){
		return this.mp
	}

	public void setMp(int mp){
		if(mp<0){
			throw new illegalArgumentException("設定されようとしているMPが異常です");
		}
		this.mp=mp;
	}

	public 

	

}
