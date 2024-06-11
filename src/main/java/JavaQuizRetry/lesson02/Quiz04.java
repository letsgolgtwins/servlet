package JavaQuizRetry.lesson02;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// quiz04_1. switch문 계절구하기
		// 3, 4, 5-봄 / 6, 7, 8-여름 / 9, 10, 11-가을 / 12, 1, 2-겨울
		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		switch (month) {
		case 3, 4, 5: {
			System.out.println("봄");
			break;
		}
		case 6, 7, 8: {
			System.out.println("여름");
			break;
		}
		case 9, 10, 11: {
			System.out.println("가을");
			break;
		}
		case 12, 1, 2: {
			System.out.println("겨울");
			break;
		}
		default: {
			System.out.println("잘못된 입력입니다.");
		}

		}// case문 종료
	}

}
