import java.util.Scanner;



public class Text6 {

	/**����һ�����֣���ӡ���������ӣ�����1�������Լ������������������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("���������֣�");
		int a = s.nextInt();
		int sum=0;
	
		for(int i=1;i<=a;i++)
		{
			if(a%i==0&&i!=a)
			{
				sum+=i;
			}
			
		}
		System.out.println(a);
		System.out.println(sum);
	}

}
