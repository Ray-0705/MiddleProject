package tw.com.ispan.project;

import java.awt.ItemSelectable;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import tw.com.ispan.projectclass.GamePanel;
import tw.com.ispan.projectclass.Tool;
import tw.com.ispan.projectclass.BarListener;
import tw.com.ispan.projectclass.GameListener;
import tw.com.ispan.projectclass.InforPanel;

public class HitMouse extends JFrame{	//遊戲窗口
	
	private InforPanel ip = new InforPanel();	//互相認識
	private GamePanel gp = new GamePanel();
	private JMenuBar bar = new JMenuBar();	//創建菜單欄
	private JMenu game = new JMenu("<遊戲選單>");	//創建兩個菜單
	private JMenu level = new JMenu("<關卡>");
	private JMenuItem start = new JMenuItem("開始遊戲");	//創建四個菜單選項
	private JMenuItem restart = new JMenuItem("重新開始");
	private JMenuItem exit = new JMenuItem("退出遊戲");
	private JMenuItem levelx = new JMenuItem("Level1");
	
	private BarListener barLis = new BarListener(this);	//監聽
	
	private GameListener gameLis = new GameListener(this);
	
	public HitMouse() {	//將構造方法拼接進去
		
//		this.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(Toolkit.getDefaultToolkit()
//				.getImage("src/tw/com/ispan/myproject/hammer.png"), new Point(), "hammer"));
		
		this.setTitle("打地鼠");
		this.setSize(Tool.WIDTH + 10, Tool.HEIGHT + Tool.GAME_HIEGHT + 130);
		this.setResizable(false);	//不可改變大小
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);	//佈局方式為空，絕對佈局
		initBar();	//組裝菜單欄
		ip.setBounds(5, 0, Tool.WIDTH, Tool.TOP_HEIGHT);	//組裝面板
		this.add(ip);
		
		gp.setBounds(5, Tool.TOP_HEIGHT+5, Tool.WIDTH, Tool.GAME_HIEGHT);
		this.add(gp);
		
		this.setLocationRelativeTo(null);	//置中
		
		//給遊戲面板添加監聽
		gp.addMouseListener(gameLis);
	}
	//組裝菜單欄
	public void initBar() {	
		game.add(start);
		game.add(restart);
		game.add(exit);
		restart.setEnabled(false);	//遊戲沒開始前不能用
		
		level.add(levelx);
		
		bar.add(game);
		bar.add(level);
		
		this.setJMenuBar(bar);
		
		//設置動作指令
				start.setActionCommand("start");
				restart.setActionCommand("restart");
				exit.setActionCommand("exit");
				levelx.setActionCommand("levelx");
		
		//添加監聽
		start.addActionListener(barLis);
		restart.addActionListener(barLis);
		exit.addActionListener(barLis);
		levelx.addActionListener(barLis);

	}

	public InforPanel getIp() {
		return ip;
	}

	public void setIp(InforPanel ip) {
		this.ip = ip;
	}

	public GamePanel getGp() {
		return gp;
	}

	public void setGp(GamePanel gp) {
		this.gp = gp;
	}

	public JMenuBar getBar() {
		return bar;
	}

	public void setBar(JMenuBar bar) {
		this.bar = bar;
	}

	public JMenu getGame() {
		return game;
	}

	public void setGame(JMenu game) {
		this.game = game;
	}

	public JMenu getLevel() {
		return level;
	}

	public void setLevel(JMenu level) {
		this.level = level;
	}

	public JMenuItem getStart() {
		return start;
	}

	public void setStart(JMenuItem start) {
		this.start = start;
	}

	public JMenuItem getRestart() {
		return restart;
	}

	public void setRestart(JMenuItem restart) {
		this.restart = restart;
	}

	public JMenuItem getExit() {
		return exit;
	}

	public void setExit(JMenuItem exit) {
		this.exit = exit;
	}

	public JMenuItem getLevelx() {
		return levelx;
	}

	public void setLevelx(JMenuItem levelx) {
		this.levelx = levelx;
	}
	
	public static void main(String[] args) {
		
		new HitMouse().setVisible(true);
	}
	
}
