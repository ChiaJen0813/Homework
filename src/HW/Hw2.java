package HW;

public class Hw2 {
	public static void main(String[] args) {

//		請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int a = 0;
		for (int b = 2; b <= 1000; b += 2) {
			a += b;
		}
		System.out.println(a);

		System.out.println("===================");

//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int c = 1;
		for (int d = 1; d <= 10; d++) {
			c *= d;
		}
		System.out.println(c);

		System.out.println("===================");

//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int e = 1;
		int f = 1;
		while (f <= 10) {
			e *= f;
			f++;
		}
		System.out.println(e);

		System.out.println("===================");

//		請設計一隻Java程式，輸出結果為以下：
//		1 4 9 16 25 36 49 64 81 100		
		for (int g = 1; g <= 10; g++) {
			int h = (int) Math.pow(g, 2); // Math.pow預設為double
			System.out.print(h + " ");
		}

		System.out.println("\n===================");

//		阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
//		int num= 0;
//		int count = 0;
//		while(num++ < 39)
//			if (num == 4 || num ==14 || num == 24 || num == 34)
//			{System.out.print("");}
//			else {
//				System.out.print(num + ", ");
//				count++;
//			}
//		System.out.print("總共有 = " + count);
		int num = 0;
		for (int z = 1; z <= 49; z++) {
			if ((z % 10 == 4) || (z / 10) == 4) {
				System.out.print("");
			} else {
				num += 1;
				System.out.print(z + ", ");
			}
		}
		System.out.println();
		System.out.print("總共有" + num + "個數字");

		System.out.println("\n===================");

//		• 請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6 
//		1 2 3 4 5
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1

		for (int m = 10; m >= 0; m--) {
			for (int n = 1; n <= m; n++) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		System.out.println("\n===================");

//		 請設計一隻Java程式，輸出結果為以下：
//		 A
//		 BB
//		 CCC
//		 DDDD
//		 EEEEE
//		 FFFFFF	
		char word = 65;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(word);
			}
			word += 1;
			System.out.println();
		}
		System.out.println("\n===================");

		// 輸出九九乘法表
//		1.用for迴圈+while迴圈

		int i;
		for (i = 1; i <= 9; i++) {
			int j = 0;
			while (++j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
		System.out.println("\n===================");

//		2.使用for迴圈+do while迴圈
		for (int k = 1; k <= 9; k++) {
			int m = 1;
			do {
				System.out.print(k + "*" + m + "=" + k * m + "\t");
			} while (++m <= 9);
			System.out.println();
		}
		System.out.println("\n===================");

//      3.使用while迴圈+do while迴圈

		int q = 1;
		while (q <= 9) {
			int s = 1;
			do {
				System.out.print(q + "*" + s + "=" + q * s + "\t");
				s += 1;
			} while (s <= 9);
			System.out.println();
			q += 1;
		}

	}
}
