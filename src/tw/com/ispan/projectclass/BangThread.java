package tw.com.ispan.projectclass;

public class BangThread extends Thread{
	
	private char[][] bomb;
	private int row;
	private int col;
 	
	public BangThread(char[][] bomb, int row, int col) {
		super();
		this.bomb = bomb;
		this.row = row;
		this.col = col;
	}

	public void run() {
		//休眠
		try {
			Thread.sleep(300);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//獲取要爆炸的宿主和位置
	
		//將此位置元素改成'Ｏ'
		bomb[row][col] = 'Ｏ';
	}
	
	
	
}
