public abstract class Template{
	String name;
	public Template(String name,String tokugi,String shusshin){
		this.name=name;
		this.tokugi=tokugi;
		this.shusshinchi=shusshin;
	}
	public void intro(){
		System.out.println("はじめまして、"+this.name+"です!");
	}
	public abstract void content();
	public void ending(){
		System.out.println("よろしくおねがいします");
	}
	public final void introduce(){
		intro();
		content();
		ending();
	}
}

