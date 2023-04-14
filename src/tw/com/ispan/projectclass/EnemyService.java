package tw.com.ispan.projectclass;

import java.util.List;

import tw.com.ispan.projectclass.Enemy;

public interface EnemyService {	//接口
	
	//隨機一種敵人的方法
	Enemy ranEnemy();
	
	//檢測是否擊中敵人的方法 鼠標點擊的x y 座標，以及敵人的集合
	Enemy checkHit(int mx, int my, List<Enemy> list);
	
}
