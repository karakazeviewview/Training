public class Mouse implements UsbConnectable{
	//抽象メソッドをオーバーライド
	@Override
	public void usbConnect(){
		System.out.println("USB接続にてマウス操作ができます");
	}
}
