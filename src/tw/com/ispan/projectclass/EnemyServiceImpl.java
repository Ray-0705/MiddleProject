package tw.com.ispan.projectclass;

import java.util.List;
import java.util.Random;

import tw.com.ispan.projectclass.Enemy;
import tw.com.ispan.projectclass.Mouse;
import tw.com.ispan.projectclass.Mouse3;
import tw.com.ispan.projectclass.Tool;
import tw.com.ispan.projectclass.Bomb;

public class EnemyServiceImpl implements EnemyService{	//實現

	@Override
	public Enemy ranEnemy() {
		Random ran = new Random();
		Enemy en = null;
		int num = ran.nextInt(3);
		if(num == 0) {
			en = new Mouse();
		}else if(num == 1) {
			en = new Mouse3();
		}else {
			en = new Bomb();
		}
		
		return en;
	}

	@Override
	public Enemy checkHit(int mx, int my, List<Enemy> list) {
		
		for (int i = 0; i < list.size(); i++) {
			Enemy en = list.get(i);
			//計算敵人的座標
			int enX = en.getCol()*Tool.GRID;	//x座標
			int enY = en.getRow()*Tool.GRID;	//y座標
			if(mx > enX && my > enY && mx < enX + Tool.GRID && my < enY + Tool.GRID ) {
				return en;
			}
		}
		
		return null;
	}

	
	

}
