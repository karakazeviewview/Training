/*
public class PC{
	App app;
	UsbConnectable device;
	public void execApp(){
		System.out.println("アプリケーションを実行する");
	}

	public void usb(){
		this.device.usbConnect();
	}

	public void setDevice(UsbConnectable device){
		this.device=device;
	}
}
*/

/*
public class PC{
	private App app;
	private UsbConnectable device;
	public PC(){
		super();
	}

	public void execApp(){
		this.app.doApp();
	}

	public void setApp(App app){
		this.app=app;
	}

	public void usb(){
		this.device.usbConnect();
	}

	public void setDevice(UsbConnectable device){
		this.device=device;
	}
}
*/


public class PC{
	private App currentApp;
	private List<App> appList=new ArrayList<>();
	private UsbConnectable device;
	public PC(){
		super();
	}

	public void addAppli(App app){
		this.appList.add(app);
	}

	public void selectApp(){
		if(appList.isEmpty()){
			System.out.println("アプリはインストールされていません");
			return;
		}
		for(int i=0;i<appList.size();i++){
			System.out.println("%d...%s%n",i,appList.get(i).name);
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("index>");
		int index=sc.nextInt();
		//this.currentApp=appList.get(index);
		this.setApp(a<Nop>set nobackup);
		
	}
	public void execApp(){
		this.app.doApp();
	}

	public void setApp(App app){
		
	}
}
