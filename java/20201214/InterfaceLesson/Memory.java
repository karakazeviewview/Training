public class Memory implements UsbConnectable{
	//抽象メソッドをオーバーライド
	@Override
	public void usbConnect(){
		System.out.println("USB接続にてデータを保存できます");
	}
}
