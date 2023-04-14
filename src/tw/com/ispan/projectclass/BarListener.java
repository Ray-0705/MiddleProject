package tw.com.ispan.projectclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import tw.com.ispan.projectclass.Tool;
import tw.com.ispan.project.HitMouse;

public class BarListener implements ActionListener{
	
	private HitMouse f;
	

	public BarListener(HitMouse f) {
		super();
		this.f = f;
	}


	@Override
	public void actionPerformed(ActionEvent e) {	//同時監聽多個
		String action = e.getActionCommand();
		
		if(action.equals("start")) {
			//開啟遊戲的開關標示
			Tool.gameState = 1;
			//開始選項不能用
			f.getStart().setEnabled(false);
			//重新開始可以用
			f.getRestart().setEnabled(true);
			//啟動執行緒
			new AppearThread(f).start();
			new DisappearThread(f).start();
			new TimeThread(f).start();
			
		}else if(action.equals("restart")) {
			Tool.gameState = 0;	
			//重置參數
			Tool.time = 30;
			Tool.hit = 0;
			Tool.score = 0;
			f.getGp().getCave().init();
			//集合要清空
			f.getGp().getEnList().clear();
			Tool.gameState = 1;
			
		}else if(action.equals("exit")) {
			
			int key = JOptionPane.showConfirmDialog(f, "是否退出?");	//返回一個int類型
			if(key == 0) {	//若key==0表示點擊確定，則退出程序
				System.exit(0);
			}
			
		}else if(action.equals("levelx")) {
			
		}
		
	}

}
