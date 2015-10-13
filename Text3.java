
public class Text3 {

	/**1-100之间奇数的和
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{sum+=i;}
		}
		System.out.println(sum);
	}

}
