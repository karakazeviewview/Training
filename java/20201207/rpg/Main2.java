import java.util.*;
public class Main{
	public static void main(String[] args){
		Hero h=new Hero("ロト",100);
		Wizard2 w=new Wizard2();
		w.setName("ジェシカ");
		w.setMp(100);
		w.setHp(100);
		Wand2 wand=new Wand2();
		wand.setName("さとりの杖");
		wand.setPower(50d);
		w.setWand(wand);
		w.heal(h);
		System.out.println(h.getName()+"のHPは"+h.getHp());
	}
}
