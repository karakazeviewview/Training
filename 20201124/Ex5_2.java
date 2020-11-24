public class Ex5_2{
	public static void main(String[] args){
		String title="お誘いの件";
		String address="uso800@gmil.com";
		String text="飲みにいきましょう";
		email(title,address,text);
	}
	public static void email(String title,String address,String text){
		System.out.println(title+"件名");
		System.out.println(address+"宛に送りました");
		System.out.println(text+"本文");
	}
}
