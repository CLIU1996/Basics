
public class FunText4 {

	/**100-1000֮�����λ��Ӻ�Ϊ5����
	 * �������˾���ķ������ͣ�����ͨ��return���أ�������벻ͨ��
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
