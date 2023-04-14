package tw.com.ispan.projectclass;

import tw.com.ispan.projectclass.EnemyService;
import tw.com.ispan.projectclass.EnemyServiceImpl;
import tw.com.ispan.projectclass.Tool;

import java.util.List;

import tw.com.ispan.project.HitMouse;

public class AppearThread extends Thread{	//敵人出現線程
	
	private HitMouse f;	//	遊戲還沒開始就一直跑（休眠）

	public AppearThread(HitMouse f) {
		super(); 
		this.f = f;
	}
	
	public void run() {
		//單獨打包 接口實現類
		EnemyService ser = new EnemyServiceImpl();
		List<Enemy> enList = f.getGp().getEnList();
		while(true) {
			if(Tool.gameState == 1) {
				Enemy en = ser.ranEnemy();
				en.appear(f.getGp().getCave().getChs());	
				//將敵人保存至集合中
				enList.add(en);
			}
			try {
				Thread.sleep(800);	//出現頻率
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}
}
