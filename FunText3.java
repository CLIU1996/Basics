
public class FunText3 {

	/**���� ��ӡ��100-1000֮�����е�����
	 * �ж�һ�����Ƿ�������
	 * ����ֵ����boolean  ��true��(false)
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
