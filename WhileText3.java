import java.util.Scanner;

import javax.sound.sampled.ReverbType;


public class WhileText3 {

	/**Ҫ������һ��������Ҫ������������λ֮�ͣ�
	 * ���磺123���������321������
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
		System.out.println("���������֣�");
		int a=s.nextInt();
		int n=a,reverseNumber =0;;
		while (n!=0) {
			reverseNumber = reverseNumber * 10 + n%10;
			n=n/10;
		}
		System.out.println(a+"���ú�������ǣ�"+reverseNumber);
	}

}
