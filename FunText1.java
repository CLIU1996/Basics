import java.util.Scanner;


public class FunText1 {

	/**自定义函数printSon()用来打印一个数的因子
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		int n = s.nextInt();
		printSon(n);
		System.out.println("请输入第二个数字：");
		int m = s.nextInt();
		printSon(m);
	}
	public static void printSon(int i){
		for(int a=1;a<=i/2;a++){
			if(i%a==0){
				System.out.println(a);
			}
		}
	}
}
