package tw.com.ispan.projectclass;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Tool extends JPanel{
	
	
	public static final int TOP_HEIGHT = 70;	//訊息面板高度
	public static final int WIDTH = 600;		//Frame寬度
	public static final int GAME_HIEGHT = 600;	//遊戲面板高度
	public static final int GRID = 200;			//網格大小=>3*3
	
	//圖片
	public static final Image MOUSE = new ImageIcon("image/mouse.png").getImage();
	public static final Image MOUSE3 = new ImageIcon("image/mouse*3.png").getImage();
	public static final Image BOMB = new ImageIcon("image/bomb01.png").getImage();
	public static final Image Bang = new ImageIcon("image/bang02.png").getImage();
	public static final Image BACK = new ImageIcon("image/back.png").getImage();
	public static final Image HAMMER = new ImageIcon("image/hammer.png").getImage();
	
//	public static final Image BACK = new ImageIcon(getClass().getResource("")).getImage();
		
	//文字對象
	public static final Font FONTINF = new Font("", Font.BOLD , 20);	//BOLD:加粗
	public static final Font FONTGAMEOVER = new Font("", Font.BOLD , 30);
	
	//數據
	public static int time = 30;
	public static int gameState = 0;	//	0=未開始; 1=遊戲開始; -1=遊戲結束
	public static int hit = 0;
	public static int score = 0;
	
}
