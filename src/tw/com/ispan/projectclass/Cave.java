package tw.com.ispan.projectclass;

import java.awt.Graphics;

import tw.com.ispan.projectclass.Tool;

public class Cave {	//洞穴=遊戲地圖

	private char[][] chs= new char[3][3];
	
	public Cave() {
		
	}
	
	//初始化洞穴方法：把裡面東西全部變成Ｏ
	public void init() {
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < chs[i].length; j++) {
				chs[i][j] = 'Ｏ';
			}
		}
		//測試：寫死狀態
//		chs[0][0] = 'M';
//		chs[0][1] = 'S';
//		chs[0][2] = 'B';

	}
	
	//展示洞穴方法：繪製地圖
	public void drawCave(Graphics g) {
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < chs[i].length; j++) {
				if(chs[i][j] == 'M') {	//繪製對應敵人
					//畫老鼠
					g.drawImage(Tool.MOUSE, j*Tool.GRID+30, i*Tool.GRID+50, Tool.GRID-60, Tool.GRID-60, null);	//x座標與j有關; y座標與i有關
				}
				if(chs[i][j] == 'S') {
					//畫老鼠＊3
					g.drawImage(Tool.MOUSE3, j*Tool.GRID+25, i*Tool.GRID+40, Tool.GRID-50, Tool.GRID-50, null);
				}
				if(chs[i][j] == 'B') {
					//畫炸彈
					g.drawImage(Tool.BOMB, j*Tool.GRID+25, i*Tool.GRID+40, Tool.GRID-50, Tool.GRID-50, null);
				}
				if(chs[i][j] == 'X') {
					//畫特效
					g.drawImage(Tool.Bang, j*Tool.GRID+25, i*Tool.GRID+40, Tool.GRID-50, Tool.GRID-50, null);
				}
			}
		}	
	}

	public char[][] getChs() {
		return chs;
	}

	public void setChs(char[][] chs) {
		this.chs = chs;
	}
	
}
