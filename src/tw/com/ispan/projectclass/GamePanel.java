package tw.com.ispan.projectclass;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import tw.com.ispan.projectclass.Cave;

public class GamePanel extends JPanel{ 	//下面那塊遊戲面板
	
	//創建洞穴（遊戲地圖）
	private Cave cave = new Cave();
		
	//創建所有敵人的集合
	private List<Enemy> enList = new ArrayList<>();
	
	
	public GamePanel() {
		this.setBackground(Color.white);
		cave.init();	//	洞穴初始化（全部都是Ｏ）：在構造方法裡初始化，初始化不要放在畫板裡，不然會一直初始化
		
		//測試模擬真實地鼠對像 設置出現
//		Enemy en = new Mouse3();
//		en.appear(cave.getChs());
	}
	
	@Override
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		//畫背景圖
		g.drawImage(Tool.BACK, 0, 0, Tool.WIDTH, Tool.GAME_HIEGHT, this);	
		
		//畫地圖（圖片）
		if(Tool.gameState == 1) {
		cave.drawCave(g);	//	初始化不然圖片出不來
		}
		
		//畫網格
		g.setColor(new Color(34, 177,76));
//		g.setColor(Color.black);
		for (int i = 1; i < Tool.GAME_HIEGHT/Tool.GRID; i++) {	//畫橫線
			g.drawLine(0, Tool.GRID*i, Tool.WIDTH, Tool.GRID*i);
		}	
		for (int i = 0; i < Tool.WIDTH/Tool.GRID; i++) {	//畫豎線
			g.drawLine(Tool.GRID*i, 0, Tool.GRID*i, Tool.GAME_HIEGHT);
		}
		
		//繪製遊戲結束
		g.setColor(Color.black);
		g.setFont(Tool.FONTGAMEOVER);
		if(Tool.gameState == -1) {
		g.drawString("遊戲結束！", 230, 80);
		}
		
		try {
			Thread.sleep(1);
		} catch (Exception e) {
			System.out.println(e);
		}
		repaint();  
	}

	public Cave getCave() {
		return cave;
	}

	public void setCave(Cave cave) {
		this.cave = cave;
	}

	public List<Enemy> getEnList() {
		return enList;
	}

	public void setEnList(List<Enemy> enList) {
		this.enList = enList;
	}
}
