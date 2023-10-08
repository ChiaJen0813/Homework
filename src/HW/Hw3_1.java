package HW;

import java.util.Scanner;
import java.util.Arrays;

public class Hw3_1 {
	public static void main(String[] args) {
//		請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形，如圖示結果：
		System.out.println("請輸入三個整數:");
		Scanner sc = new Scanner(System.in);
		int i1 = sc.nextInt();
		int i2 = sc.nextInt();
		int i3 = sc.nextInt();
		
		int[]side = {i1,i2,i3};
		Arrays.sort(side);
		
		if(side[0] + side[1] <= side[2] && side[0] <= 0) {
			System.out.println("不是三角形");
		}
		else if(side[0] == side[1] && side[1] == side[2]) {
			System.out.println("正三角形");
		}
		else if(side[0] == side[1] || side[1] == side[2]) {
			System.out.println("等腰三角形");
		}
		else {System.out.println("其他三角形");}
		sc.close();		
	}
}
