package HW;

import java.util.Scanner;

public class Hw3_2 {
	public static void main(String[] args) {
//	請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//	對則顯示正確訊息，如圖示結果：(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案)
		int number = (int)(Math.random()*100);
		Scanner sc = new Scanner(System.in);
		while (true) {
			int A = sc.nextInt();
			if (A > number) {
				System.out.println("太大了!");
			} else if (A < number) {
				System.out.println("太小了!");
			} else {
				System.out.println("恭喜答對啦!");
				break;
			}			
		}
		sc.close();
		}
}
