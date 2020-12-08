import java.util.*;
public class Main{
	public static void main(String[] args){
		/*
		Hero h=new Hero("ロト",100);
		Wizard2 w=new Wizard2();
		w.setName("ジェシカ");
		w.setMp(100);
		w.setHp(100);
		Wand2 wand=new Wand2();
		wand.setName("悟りの杖");
		wand.setPower(50d);
		w.setWand(wand);
		w.heal(h);
		System.out.println(h.getName()+"のHPは"+h.getHp());
		*/
		
	//	System.out.println(Hero.money);
		Hero2.showMoney();
		Hero h=new Hero2("ロト");
		h.setHp(100);
		Hero2 h1=new Hero2("ジェシカ");
		h1.setHp(100);

		h.attack();
		h1.attack();
		Hero.showMoney();
	//	h1.showMoney();

		System.out.println(h.getName()+" "+h.getHp());
		System.out.println(h1.getName()+" "+h1.getHp());
		
	}
}
