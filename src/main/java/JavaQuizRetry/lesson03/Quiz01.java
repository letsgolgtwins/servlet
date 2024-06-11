package JavaQuizRetry.lesson03;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// quiz01_1. 반복 출력
		System.out.print("횟수를 입력하세요 : ");
		int num = scan.nextInt();
		int i = 0;
		while (i < num) {
			System.out.println("파이팅!!!");
			i++;
		}

		// quiz01_2. 카운트 다운 "발사"
		System.out.print("카운트 다운 수를 입력하세요 : ");
		int countDown = scan.nextInt();
		while (countDown >= 0) {
			System.out.println(countDown);
			countDown--;
		}
		System.out.println("발사");

		// quiz01_3. 반복 입력
		int a = 5;
		while (a > 0) {
			System.out.print("수를 입력하세요 : ");
			int su = scan.nextInt();
			System.out.println("출력 : " + su);
			a--;
		}

		// quiz01_4. 구구단 3단
		int su = 1;
		while (su < 10) {
			System.out.println("3 X " + su + " = " + (3 * su));
			su++;
		}

	}

}
