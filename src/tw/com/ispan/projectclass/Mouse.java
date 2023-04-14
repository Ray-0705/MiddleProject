package tw.com.ispan.projectclass;

import java.util.Random;

public class Mouse extends Enemy{

	public Mouse() {	//要在父類別定義好
		//初始化數據 分值 型態 名字
		setValue(5);
		setType('M');
		setName("地鼠");
	}
	
	@Override
	public void appear(char[][] arr) {
		Random ran = new Random();
		int row = ran.nextInt(arr.length);
		int col = ran.nextInt(arr[0].length);
		//保存在屬性
		this.setRow(row);
		this.setCol(col);
		arr[row][col] = this.getType();
	}
	
}
