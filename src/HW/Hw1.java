package HW;

public class Hw1 {
//	請設計一隻Java程式，計算12，6這兩個數值的和與積
	public static void main(String[] args) {
		int x = 12, y = 6;
		int t1 = x + y;
		int t2 = x * y;
		System.out.println(t1);
		System.out.println(t2);

		System.out.println("===================");

//		請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int egg = 200, dozen = 12;
		int h1 = egg / dozen;
		System.out.println(h1);

		System.out.println("===================");

//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int num = 256559, sec = 1, min = sec * 60, hour = min * 60, day = hour * 24;
		System.out.printf("%d秒是%d天%d時%d分%d秒%n", num, num / day, (num % day) / hour, ((num % day) % hour) / min,
				(((num % day) % hour) % min) / sec);

		System.out.println("===================");
		
//		請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double Pi = 3.1415;
		int r = 5;
		double 圓面積 = r * 2 * Pi;
		System.out.println("圓面積 ="+ 圓面積);
		double 圓周長 = Pi * Math.pow(r, 2);
		System.out.println("圓周長 ="+ 圓周長);

		System.out.println("===================");

//		某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		int money = 1_500_000;
		double rate = 1.02;
		System.out.println(money * Math.pow(rate, 10)); // 1.02十次方*本金

		System.out.println("===================");

//		請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
		System.out.println(5 + 5); // 就是5+5=10
		System.out.println(5 + '5'); //此為預設整數型別int數值5+型別char5，依Unicode編碼char5代表十六進位值為0x35，換算十進位數值為型別int數值53，所得十進位之和int數值58
		System.out.println(5 + "5"); // 5加字串5=55
		
				
	}

}
