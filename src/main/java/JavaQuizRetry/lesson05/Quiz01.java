package JavaQuizRetry.lesson05;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Quiz01_1. - 2의 제곱 함수
		// 정수를 입력 받아서 2제곱의 결과를 돌려주는 함수를 만들고
		// 호출한 값을 출력하세요.
		System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
		int su = scan.nextInt();
		System.out.println(su + "의 제곱은 " + Jegob(su) + "이다.");

		// quiz01_2. 평균 구하기 함수
		// 4개의 값을 받아서 평균을 돌려주는 함수를 만들고 호출한 값을 출력하세요.
		System.out.print("점수를 입력하세요 : ");
		int jumsu1 = scan.nextInt();
		int jumsu2 = scan.nextInt();
		int jumsu3 = scan.nextInt();
		int jumsu4 = scan.nextInt();
		System.out.println("평균은 " + Average(jumsu1, jumsu2, jumsu3, jumsu4) + "점");

		// quiz01_3. 몫과 나머지 출력 함수
		// 두 수를 받아서 몫과 나머지를 출력하는 함수를 만드세요. (리턴값 없음)
		System.out.print("숫자와 나눌 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		Devide(num1, num2);

		// quiz01_4. 홀짝 함수
		// 정수를 입력 받아서 짝수면 true 홀수면 false를 돌려 주는 함수를 만드세요.
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		System.out.println(OddorEven(number));
	}

	// 1.
	public static int Jegob(int a) {
		return a * a;
	}

	// 2.
	public static double Average(int a1, int a2, int a3, int a4) {
		return (a1 + a2 + a3 + a4) / 4.0;
	}

	// 3.
	public static void Devide(int number1, int number2) {
		System.out.println("몫: " + (number1 / number2));
		System.out.println("나머지: " + (number1 % number2));
	}

	// 4.
	public static boolean OddorEven(int num3) {
		if (num3 % 2 == 0) {
			return true;
		} else {
			return false;
		}
		// 이거 삼항조건문 풀이도 있다. 연습할 것.
	}

}
