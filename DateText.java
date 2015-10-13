public class DateText {

	/**
	 * 计算两个日期之间相差的天数 假设1998-10-10，2010-5-5 首先获取1998-10-10这个日期在这一年还剩多少天
	 * 再次获取2010-5-5这个日期在这一年已经过了多少天 然后99年到09年中间的整年天数 1.写一个函数，判断一年是否是闰年 public
	 * static boolean isLeap(int y ) 2.写一个函数，计算一个日期在这之前已经过了多少天 public static
	 * int getDays(int y,int m,int d) 3.写一个函数，计算一个日期在这一年还剩下多少天 总天数-已经过的就是剩下的
	 * 4.写一个函数，直接算出两个日期相差的天数
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(getDays(1999,4,20));
		System.out.println(subDays(1999, 1, 5, 1999, 1, 10));
	}

	public static boolean isLeap(int y) {
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
			return true;
		// 没有影响可以省略
		return false;
	}

	public static int getDays(int y, int m, int d) {
		int sum = 0;
		switch (m - 1) {
		case 11:
			sum += 30;
		case 10:
			sum += 31;
		case 9:
			sum += 30;
		case 8:
			sum += 31;
		case 7:
			sum += 31;
		case 6:
			sum += 30;
		case 5:
			sum += 31;
		case 4:
			sum += 30;
		case 3:
			sum += 31;
		case 2:
			if (isLeap(y))// 一个函数调用了另外一个函数，但是不能在一个函数里声明另外一个函数
				sum += 29;
			else
				sum += 28;// 需要判断闰年
		case 1:
			sum += 31;
		}
		sum += d;
		return sum;
	}

	public static int otherDays(int y, int m, int d) {
		if (isLeap(y))
			return 366 - getDays(y, m, d);
		else
			// 可以去掉
			return 365 - getDays(y, m, d);
	}

	public static int subDays(int y1, int m1, int d1, int y2, int m2, int d2) {
		int sum1 = otherDays(y1, m1, d1);
		int sum2 = getDays(y2, m2, d2);
		int sum3 = 0;
		if (y1 == y2) {// 只要计算y1年已经过的，然后减去y2年已经过的，可能有负数
			int days1 = getDays(y1, m1, d1) - getDays(y2, m2, d2);
			return abs(days1);
		} else if (y1 < y2) {
			
			for (int i = y1 + 1; i < y2; i++) {
				if (isLeap(i))
					sum3 += 366;
				else
					sum3 += 365;
			}
		}else {
			 sum1 = getDays(y1, m1, d1);
			 sum2 = otherDays(y2, m2, d2);
			 sum3 = 0;
			for (int i = y2 + 1; i < y1; i++) {
				if (isLeap(i))
					sum3 += 366;
				sum3 += 365;
			}
			
		}
		return sum1 + sum2 + sum3;

	}

	public static int abs(int n) {
		return n >= 0 ? n : -n;
	}
}
