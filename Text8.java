
public class Text8 {

	/**¥Ú”°–«∫≈
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=1+(i-1)*2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
