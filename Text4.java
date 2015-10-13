
public class Text4 {

	/**打印1-200之间既能被3整除又能被5整除的数有多少个
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=200;i++)
		{
			if(i%3==0&&i%5==0)
			{
				count+=1;
				}
		}
		System.out.println(count);
	}

}
