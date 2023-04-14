package tw.com.ispan.projectclass;

import java.util.Random;

public class Mouse3 extends Enemy{

	public Mouse3() {	//要在父類別定義好
		//初始化數據 分值 型態 名字
		setValue(10);
		setType('S');
		setName("地鼠三兄弟");
	}
	
	@Override
	public void appear(char[][] arr) {
		Random ran = new Random();
		int row = ran.nextInt(2);
		int col = ran.nextInt(arr[0].length);
		//保存在屬性
		this.setRow(row);
		this.setCol(col);
		arr[row][col] = this.getType();
	}
	
}
