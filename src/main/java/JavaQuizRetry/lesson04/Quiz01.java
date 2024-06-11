package JavaQuizRetry.lesson04;

public class Quiz01 {

	public static void main(String[] args) {
		// quiz01_1. 주사위 문제
		// 두개의 주사위를 굴렸을 때, 나올 수 있는 모든 경우의 수 출력
//		for (int i = 1; i <= 6; i++) {
//			for (int j = 1; j <= 6; j++) {
//				System.out.print("(" + i + "," + j + ")");
//			}
//			System.out.println();
//		}
//
//		// quiz01_2. 구구단 2단~9단까지 모두 출력
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + " X " + j + " = " + (i * j));
//			}
//		}

		// quiz01_3. 별찍기
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// quiz01_4. 거꾸로 별찍기
		// *****
		// ****
		// ***
		// **
		// *
		System.out.println(); // 줄바꿈
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// quiz01_5. 피라미드
		// - 아직 못 품
		System.out.println(); // 줄바꿈
		for (int i = 0; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("_");
			}
			for (int k = 0; k < (i * 2) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
