package JavaQuizRetry.lesson02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// quiz03_1. 음수 양수 판별
		System.out.print("정수를 입력하세요 : ");
		int jungsu = scan.nextInt();
		if (jungsu > 0) {
			System.out.println("양수입니다.");
		} else if (jungsu == 0) {
			System.out.println("0입니다.");
		} else {
			System.out.println("음수입니다.");
		}

		// quiz03_2. 학점 출력
		// 90 점이상이면 A , 80점 이상 B, 70점 이상 C, 60점 이상 D, 그외 F
		System.out.print("점수를 입력하세요 : ");
		int jumsu = scan.nextInt();
		if (jumsu >= 90 || jumsu == 100) {
			System.out.println("A");
		} else if (jumsu >= 80) {
			System.out.println("B");
		} else if (jumsu >= 70) {
			System.out.println("C");
		} else if (jumsu >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

		// quiz03_3. 비만도 구하기
		// ~ 10 이하 정상
		// ~ 20 이하 과체중
		// 20 ~ 초과 비만
		System.out.print("bmi 수치를 입력하세요 : ");
		int bmi = scan.nextInt();
		if (bmi <= 10) {
			System.out.println("정상");
		} else if (bmi <= 20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
	}

}
