package tw.com.ispan.projectclass;

public abstract class Enemy {	//敵人父類
	private int row;
	private int col;
	private int value;
	private char type;
	private String name;
	
	public Enemy() {
		
	}
	
	//敵人出現的方法
	public abstract void appear(char[][] arr);

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
