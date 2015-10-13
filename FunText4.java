
public class FunText4 {

	/**100-1000之间各数位相加和为5的数
	 * 函数有了具体的返回类型，必须通过return返回，否则编译不通过
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=1000;i++){
			if(getSum(i)==5){
				System.out.println(i);
			}
		}
	}
	public static int getSum(int n){
		int sum=0;
		while(n!=0){
			sum=sum+n%10;
			n=n/10;
		}
		return sum;
	} 
}
