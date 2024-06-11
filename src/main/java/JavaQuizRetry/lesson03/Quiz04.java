package JavaQuizRetry.lesson03;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// quiz04_1. 합 구하기
		System.out.print("수를 입력하세요 : ");
		int su = scan.nextInt();
		int sum = 0;
		for (int i = 0; i <= su; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

		// quiz04_2. 팩토리얼
		// 입력 받은 수의 최대값 : 10 <-- 이건 시스템상 이렇게 되어있는듯 > 물어보기!
		System.out.print("수를 입력하세요 : ");
		int su2 = scan.nextInt();
		int result = 1;
		for (int i = 1; i <= su2; i++) {
			result = result * i;
		}
		System.out.println(result);

		// quiz04_3. 약수 구하기
		System.out.print("수를 입력하세요 : ");
		int su3 = scan.nextInt();
		for (int i = 1; i <= su3; i++) {
			if (su3 % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
