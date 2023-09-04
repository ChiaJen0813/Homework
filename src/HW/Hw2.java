package HW;

public class Hw2 {
	public static void main(String[] args) {

//		請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int a = 0;
		for (int b = 2; b <= 1000; b += 2){
			a=a+b;}    //a += b;}
		System.out.println(a);
		
		System.out.println("===================");

//		請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
		int c = 1;
		for (int d = 1; d <= 10; d++) {
			c=c*d;}     //c *= d;}
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
		
	}

}
