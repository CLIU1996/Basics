import java.util.Scanner;

public class XunhuanText1 {

	/**
	 * ����������һ�����֣��õ�������ֵ���ʽ�ֽ� ���磺��������10���õ�10=2*5
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("���������֣�");
		int n = s.nextInt();
		System.out.print(n + "=");
		int a = n, count = 0, i = 2;
		while (a > i) {
			if (a % i == 0) {
				if (count > 0) {
					System.out.print("*");
				}
				System.out.print(i+"*");
				a=a/i;
				System.out.print(i);
				count++;
			}else{
				i++;
			}
		}
		if(count==1){
			System.out.print("*1");
		}else if (count < 1) {
            System.out.print("1*1");
        }
        System.out.println();
	}
}
