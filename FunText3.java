
public class FunText3 {

	/**案例 打印出100-1000之间所有的素数
	 * 判断一个数是否是素数
	 * 返回值类型boolean  （true）(false)
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=100;i<=1000;i++){
			if(isPrimeNumber(i)){
			System.out.print(i+"  ");
			}
		}
	}
	public static boolean isPrimeNumber(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0)
				return false;
		}
		return true;

	}
}
