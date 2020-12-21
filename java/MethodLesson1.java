import java.util.*;
public class MethodLesson1{
	public void gameStart(String[] args){
		System.out.println("点数を0で初期化");
		System.out.println("startのメイン処理");
	}
	public void gameMain(){
		System.out.println("ゲームのメイン処理");
	}
	public void gameEnd()(String[] args){
		System.out.println("スコアをDBに記録");
		System.out.println("retryボタンを表示");
	}
	public static void main(String[] args){
		gameStart();
		gameMain();
		gameEnd();
	}
}
