import java.util.Scanner;


public class FunText1 {

	/**�Զ��庯��printSon()������ӡһ����������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		int n = s.nextInt();
		printSon(n);
		System.out.println("������ڶ������֣�");
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
