public class Ex5_3{
	public static void main(String[] args){
		String title="お誘いの件";
		String address="uso800@gmil.com";
		String text="飲みにいきましょう";
		email(title,address,text);
	}
	public static void email(String address,String text){
		System.out.println(address+"宛に以下の内容で送りました");
		System.out.println("件名:無題");
		System.out.println("本文"+text);
	}
	public static void email(String title,String address,String text){
		System.out.println(title+"件名");
		System.out.println(address+"宛に送りました");
		System.out.println(text+"本文");
	}
}
