package JavaQuizRetry.lesson01;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// temp 알고리즘
		// temp 알고리즘
		Scanner scan = new Scanner(System.in);
		System.out.print("x:");
		int x = scan.nextInt();
		System.out.print("y:");
		int y = scan.nextInt();

		int temp = x;
		x = y;
		y = temp;
		System.out.println("x는 " + x + "이고, y는 " + y + " 입니다.");
	}

}
