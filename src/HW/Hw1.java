package HW;

public class Hw1 {
	public static void main(String[] args) {
		int x = 12, y = 6;
		int t1 = x + y;
		int t2 = x * y;

		System.out.println(t1);
		System.out.println(t2);

		System.out.println("===================");

		int egg = 200, dozen = 12;
		int h1 = egg / dozen;
		System.out.println(h1);

		System.out.println("===================");

//		int time = 256559, sec = 1, min = 60 * sec, hour = 60 * min, day = 24 * hour;
//		int D = time / day;
//		int H = time / hour;
//		int M = time / min;
//		int S = time / sec;
//		System.out.println(D);
//		System.out.println(H);
//		System.out.println(M);
//		System.out.println(S);

		int num = 256559, sec = 1, min = sec * 60, hour = min * 60, day = hour * 24;
		System.out.printf("%d秒是%d天%d時%d分%d秒%n", num, num / day, (num % day) / hour, ((num % day) % hour) / min,
				(((num % day) % hour) % min) / sec);

		System.out.println("===================");

		final double Pi = 3.1415;
		int r = 5;
		double 圓面積 = r * 2 * Pi;
		System.out.println(圓面積);
		double 圓周長 = Pi * Math.pow(r, 2);
		System.out.println(圓周長);

		System.out.println("===================");

		int money = 1_500_000;
		double rate = 1.02;
		System.out.println(money * Math.pow(rate, 10)); // 1.02十次方*本金

		System.out.println("===================");

		System.out.println(5 + 5); // 就是5+5=10
		System.out.println(5 + '5'); //
		System.out.println(5 + "5"); // 5加字串5=55
	}

}
