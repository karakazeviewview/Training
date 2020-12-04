public class Notebook extends Book{
	String content="";
	public Notebook(int page,int price){
		//Notebookコンストラクタ
		super(page,price);
	}

	public void write(String str){
		this.content+=str;
	}

	@Override
	public void showStatus(){
		super.showStatus();
		System.out.println("");
		}
	}

	public addContent
}
