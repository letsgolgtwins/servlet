package JavaQuizRetry.lesson04;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 중첩 반복문 고급 문제
		Scanner scan = new Scanner(System.in);
		// quiz02_1. 모래 시계 출력하기
//		System.out.print("모래시계 크기를 입력하세요 : ");
//		int su = scan.nextInt();

		// 3 입력 할 경우 한정
//		for (int i = 0; i < su; i++) { // 0행, 1행, 2행
//			if (i % 2 == 0) { // 0행, 2행
//				for (int j = 0; j < su; j++) { // 0열, 1열, 2열
//					if (j % 2 == 0) { // 그 중 0열, 2열
//						System.out.print("*");
//					} else { // 그 중 1열
//						System.out.print("+");
//					}
//				}
//				System.out.println();
//			} else { // 1행
//				for (int k = 0; k < su; k++) {
//					if (k % 2 == 0) { // 0열, 2열
//						System.out.print("-");
//					} else { // 1열
//						System.out.print("*");
//					}
//				}
//				System.out.println();
//			}
//		}
//		System.out.println();

		// su = 5 라고 가정하고 풀겠음
//		for (int i = 1; i <= su; i++) { // 1,2,3,4,5행
//
//			if (i == (su / 2) + 1) { // 정 가운데 행 (3행)
//				for (int k = 0; k < su; k++) {
//					if (k == su / 2) { // 정 가운데 행 중 가운데 열
//						System.out.print("*");
//					} else {
//						System.out.print("-"); // 정 가운데 행 중 가운데 제외한 나머지 열
//					}
//				}
//				System.out.println();
//				
//			} else if (i == 1 || i == su) { // 맨 위, 맨 아래 행
//				for (int k = 0; k < su; k++) {
//					if (k % 2 == 0) { // 짝수열
//						System.out.print("*");
//					} else { // 홀수열
//						System.out.print("+");
//					}
//				}
//				System.out.println();
//			} else { // 가운데, 맨 위, 맨 끝 제외한 나머지 행
//
//		}

		// 2. 숫자 삼각형 출력하기
		// 삼각형의 크기를 나타내는 양의 정수 3 <= n <= 99를 입력받고 숫자 삼각형을 출력하세요.
		System.out.print("숫자 삼각형의 크기를 입력하세요 : ");
		int number = scan.nextInt();
		// number에 6 찍었다고 가정
		for (int i = 0; i < number; i++) { // 0 1 2 3 4 5 6행
			for (int j = 0; j < i + 1; j++) { // 열 오름차순

				for (int m = number - 1; m >= 1; m--) { // m 5 4 3 2 1
					System.out.print(i + 1 + m);
				}

			}
			System.out.println();

		}

	}

}
