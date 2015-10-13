import java.util.Scanner;

import javax.sound.sampled.ReverbType;


public class WhileText3 {

	/**要求输入一个整数，要求求出其各个数位之和；
	 * 例如：123，，，输出321，，，
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("请输入数字：");
		int a=s.nextInt();
		int n=a,reverseNumber =0;;
		while (n!=0) {
			reverseNumber = reverseNumber * 10 + n%10;
			n=n/10;
		}
		System.out.println(a+"倒置后的数字是："+reverseNumber);
	}

}
