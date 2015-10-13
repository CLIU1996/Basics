public class UserLabel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		next: for (int i = 50; i <= 100; i++) {
			for (int k = 2; k <= i / 2; k++) {
				if (i % k == 0)
					continue next;
			}
			System.out.println(i + " ");
		}
	}

}
