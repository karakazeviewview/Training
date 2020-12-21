package lesson1;

public class lesson1_1 {

	public static void main(String[] args) {
		System.out.println("Hello Eclipse");
		String str="Hello";
		if(str.equalsIgnoreCase("Hello")) {
			System.out.println("ok");

		}
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1秒経ちました");
	}
}
