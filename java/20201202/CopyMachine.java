import java.util.*;
public class CopyMachine{
	int paper;
	public CopyMachine(int sheet){
		if(sheet<0){
			this.paper=0;
		}else{
			this.paper=sheet;
		}
	}
	
	public void feedPaper(int sheet){
		System.out.println(sheet+"枚給紙しました。");
		this.paper+=sheet;
	}

	public void copy(int sheet){
		if(this.paper<sheet){
			System.out.println(this.paper+"枚コピーしました。");
			this.paper=0;
		}else{
			System.out.println(sheet+"枚コピーしました。");
			this.paper-=sheet;
		}
	}

	public void display(){
		System.out.println("コピー可能な枚数は"+this.paper+"です。");
	}
}
