
public class Text5 {

	/**1!+2!+3!+4!+...+5!+6!
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int t=1;
		for(int i=1;i<=6;i++)
		{
			t=t*i;
			sum+=t;
		}
		System.out.println(sum);
	}

}
