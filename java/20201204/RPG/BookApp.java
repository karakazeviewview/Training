import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("本のページ数を入力して下さい >");
		int bookPage=sc.nextInt();
		System.out.print("本の価格を入力してください");
		Book book=new Book(bookPage,bookPrice);
		int bookPrice=sc.nextInt();
		System.out.print("ノートのページ数を入力してください");
		int notePage=sc.nextInt();
		System.out.print("ノートの価格を入力してください");
		int notePrice=sc.nextInt();
		NoteBook noteBook=new NoteBook(notePage,notePrice);
		while(true){public class NoteBook extends Book{
			String content="";
			public NoteBook(int page,int price){
				super(page,price);
			}
			public void write(String str){
				this.content += str;
			}
			@Override
				public void showStatus(){
					super.showStatus();
					System.out.println("内容:"+this.content);
				}
		}

		matsuda  1分前
			import java.util.*;
		public class BookApp{
			public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
				System.out.print("本のページ数を入力して下さい >");
				int bookPage=sc.nextInt();
				System.out.print("本の価格を入力して下さい >");
				int bookPrice=sc.nextInt();
				Book book=new Book(bookPage,bookPrice);
				System.out.print("ノートのページ数を入力して下さい >");
				int notePage=sc.nextInt();
				System.out.print("ノートの価格を入力して下さい >");
				int notePrice=sc.nextInt();
				NoteBook notebook=new NoteBook(notePage,notePrice);
				while(true){
					System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4.   終了>");
					int select=sc.nextInt();
					switch(select){
						case 1:
							book.showStatus();
							break;
						case 2:
							notebook.showStatus();
							break;
						case 3:
							System.out.print("書き込む内容を入力して下さい >");
							String str=sc.next();
							notebook.write(str);
							break;
						default:
							System.out.println("アプリケーションを終了します");
							return;
					}
				}
			}
		}
			case 1:
		book.showStatus();
		break;
			case 2:
		notebook.showStatus();
		break;
			case 3:
		System.out.print("書き込む内容を入力してください>");
		String str=sc.next();
		notebook.write(str);
		break;
		book.showStatus();
		break;
			default:
		System.out.println("アプリケーションを終了します");
		return;
		}
	}
}
}
