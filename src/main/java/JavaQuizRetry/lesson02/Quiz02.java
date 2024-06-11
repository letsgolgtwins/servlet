package JavaQuizRetry.lesson02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// quiz02_1. 두 점수 합격
		System.out.print("두 점수를 입력하세요 : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		if (score1 >= 70 && score2 >= 70) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

		// quiz02_2. 공배수 구하기
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3의 공배수 입니다.");
		} else {
			System.out.println("2와 3의 공배수가 아닙니다.");
		}

		// quiz02_3. 범위
		System.out.print("1~10 사이의 수를 입력하세요 : ");
		int range = scan.nextInt();
		if (range > 10 || range < 1) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println("잘 입력하셨습니다.");
		}
	}

}
