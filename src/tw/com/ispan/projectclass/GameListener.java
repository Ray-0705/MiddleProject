package tw.com.ispan.projectclass;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import tw.com.ispan.project.HitMouse;

public class GameListener implements MouseListener{
	
	private	HitMouse f;
	
	public GameListener(HitMouse f) {
		super();
		this.f = f;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(Tool.gameState == 1) {
			EnemyService ser = new EnemyServiceImpl();
//			char[][] arr = f.getGp().getCave().getChs();
			char[][] bomb = f.getGp().getCave().getChs();
			Enemy en =  ser.checkHit(e.getX(), e.getY(), f.getGp().getEnList());
			if(en != null) {				//有打中
				Tool.score += en.getValue();
				Tool.hit++;
				//還原洞穴
//				arr[en.getRow()][en.getCol()] = 'X';
				bomb[en.getRow()][en.getCol()] = 'X';
				//將敵人從集合中移除
				f.getGp().getEnList().remove(en);
				
				//啟動爆炸線程（運行一次即結束）
				new BangThread(bomb, en.getRow(), en.getCol()).start(); 
				
			}else {
				Tool.score -= 5;
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
