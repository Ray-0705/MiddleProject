package tw.com.ispan.projectclass;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import tw.com.ispan.projectclass.Tool;

public class InforPanel extends JPanel {	//上面那塊訊息面板
	
	public InforPanel() {
		this.setBackground(Color.gray);
	}
	
	@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.setFont(Tool.FONTINF);
			
			//繪製計時
			g.drawString("時間：" + Tool.time,50, 45);
			//繪製擊殺
			g.drawString("命中：" + Tool.hit, 250, 45);
			//繪製得分
			g.drawString("得分：" + Tool.score, 450, 45);
			
			try {
				Thread.sleep(1);
			} catch (Exception e) {
				System.out.println(e);
			}
			repaint();
		}
}
