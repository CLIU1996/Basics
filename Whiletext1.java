
public class Whiletext1 {

	/**从10-1000之间数的数位相加为5的数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=10;i<=1000;i++)
		{
			int sum=0;
			int t=i;
			while(t!=0)
			{
				sum=sum+t%10;
				t=t/10;
			}
			if(sum==5)
			{
				count++;
				System.out.print(i);
				System.out.println("  "+count);
			}
		
		}
	}

}
