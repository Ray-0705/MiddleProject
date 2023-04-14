package tw.com.ispan.projectclass;

import java.util.ArrayList;
import java.util.List;

import tw.com.ispan.projectclass.Tool;
import tw.com.ispan.project.HitMouse;

public class DisappearThread extends Thread {	//敵人消失線程，要用集合
	
	private HitMouse f;

	public DisappearThread(HitMouse f) {
		super();
		this.f = f;
	}
	
	public void run() {	
		List<Enemy> enList = f.getGp().getEnList();
		char[][] arr = f.getGp().getCave().getChs();
		while(true) {
			//判斷集合中是否有元素，且遊戲狀態＝1(運行狀態)
			if(enList.size()>0 && Tool.gameState == 1) {
				Enemy en = enList.get(0);
				//將第一個敵人所在的行列變成'Ｏ'
				arr[en.getRow()][en.getCol()] = 'Ｏ';
				
				//移除第一個敵人（先進先出）
				enList.remove(en);	//0也可以
			}
			
			
			try {
				Thread.sleep(1600);	//	消失頻率
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
