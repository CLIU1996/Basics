
public class Text4 {

	/**��ӡ1-200֮����ܱ�3�������ܱ�5���������ж��ٸ�
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
