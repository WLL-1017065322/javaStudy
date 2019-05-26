import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	
	//1.1加载图片
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	//窗口加载
	void launchFrame() {
		//宽高
		setSize(856,500);
		//坐标
		setLocation(50,50);
		
		setVisible(true);
	}
	
	double x = 100;
	double y = 100;
	
	//1.2画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口画了一次");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
//		g.drawImage(ball,50,200,null);
		
	}

	//程序入口
	public static void main(String[] arg) {
		System.out.println("我是谁");
		
		BallGame game = new BallGame();
		game.launchFrame();
		
	}
	

}
