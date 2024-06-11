package JavaQuizRetry.lesson03;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// quiz02_1. 반복 출력 35~40
		for (int i = 35; i < 41; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// quiz02_2. 카운트 다운 출력 5 ~ -5
		for (int i = -5; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		// quiz02_3. 특정 조건 구하기 1 ~ 50 사이에 3의 배수만 출력
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		// quiz02_4. 개수 세기 1 ~ 100 사이에 7의 배수 개수를 구하시오.
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count++;
			}
		}
		System.out.println("7의 배수의 개수는 : " + count + "개");

		// quiz02_5. 구구단 / 숫자를 입력받아 그 단 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요 : ");
		int dan = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
		}
	}

}
