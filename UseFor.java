import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JApplet;
public class UseFor  extends JApplet{

	/**画50个随机颜色的同心圆（单重循环）
	 * @param args
	 */
		// TODO Auto-generated method stub
		public void paint(Graphics g){
			super.paint(g);
			Random rd =new Random();
			int radius=1,red,green,blue;
			for(int i=1;i<=50;i+=1){
				red=rd.nextInt(256);
				green=rd.nextInt(256);
				blue=rd.nextInt(256);
				g.setColor(new Color(red,green,blue));
				myDraw(g,250,250,radius);
				radius+=4;
			}
		}
		public void myDraw(Graphics gg,int centerX,int centerY,int radius){
			gg.drawOval(centerX-radius,centerY-radius,2*radius,2*radius);
		}
}
