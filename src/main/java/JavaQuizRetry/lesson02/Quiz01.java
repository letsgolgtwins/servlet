package JavaQuizRetry.lesson02;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// quiz01_1. 숫자 비교
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		if (number > 10) {
			System.out.println("10보다 큽니다.");
		} else {
			System.out.println("10보다 작습니다.");
		}

		// quiz01_2. 수 비교
		System.out.print("두 개의 수를 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		if (a == b) {
			System.out.println(a + "와 " + b + "는 같습니다.");
		} else if (a > b) {
			System.out.println(a + "이(가) 더 큽니다.");
		} else {
			System.out.println(b + "이(가) 더 큽니다.");
		}

		// quiz01_3. 시험 합격
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();
		if (score >= 70) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}

		// quiz01_4. 홀짝 검사
		System.out.print("수를 입력하세요 : ");
		int su = scan.nextInt();
		if (su % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

	}

}
