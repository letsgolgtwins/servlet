package JavaQuizRetry.lesson03;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// quiz03_1. 무한 입력
		while (true) {
			System.out.print("수를 입력하세요:");
			int su = scan.nextInt();
			if (su == 0) {
				System.out.println("끝");
				break;
			}
		}

		// quiz03_2. 배수의 합 구하기
		// 3 ~ 50 중 3의 배수의 합을 출력. / 증감연산은 +1씩 / continue문 사용할 것.
		int sum = 0;
		for (int i = 3; i <= 50; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		// continue문을 안써서 틀림.
	}

}
