import java.util.Scanner;



public class Text6 {

	/**输入一个数字，打印其所有因子，包含1不包含自己，并对所有因子求和
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("请输入数字：");
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
