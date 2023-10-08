package HW;

import java.util.Scanner;

public class Hw3_3 {
	public static void main(String[] args) {
//		阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數，如圖：

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字?");
		int x = sc.nextInt();
		int num = 0;
		for (int i = 1; i <= 49; i++) {
			if (i / 10 != x && i % 10 != x) {
				System.out.print(i + "\t");
				num++;
			}
			if (i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("總共有" + num + "數字可選");
		sc.close();

	}
}
