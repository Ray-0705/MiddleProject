package tw.com.ispan.projectclass;

import tw.com.ispan.project.HitMouse;

public class TimeThread extends Thread{	//	倒數的線程
	
	private HitMouse f;	
	
	public TimeThread(HitMouse f) {
		super();
		this.f = f;
	}
	
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			
			if(Tool.gameState == 1) {
				Tool.time--;
				if(Tool.time == 0) {
					//修改遊戲狀態=-1，遊戲結束
					Tool.gameState = -1;
				}
			}
		}
	}
}
