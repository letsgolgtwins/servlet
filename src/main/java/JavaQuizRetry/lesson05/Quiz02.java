package JavaQuizRetry.lesson05;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// quiz02_1. - 합 구하기
		// 수를 입력 받아서 1에서 부터 그 수 까지의 합을 구하는 함수를 만드세요.
		// 단, 합이 100이 넘으면 합을 중단하고 그 때 까지의 합을 리턴하세요.
		System.out.print("수를 입력하세요 : ");
		int su = scan.nextInt();
		System.out.println(Hap(su));

		// quiz02_2. 최솟값
		// 5개의 수를 입력 받아서 최솟값을 출력하는 함수를 만드세요.(리턴값 없음)
		// 입력 가능한 최대값은 1000 입니다.
		System.out.print("5개의 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		Minimum(num1, num2, num3, num4, num5);

		// quiz02_3. 소수(prime)판별
		// 소수: 1과 자기자신 이외에 나누어 떨어지지 않는 수.
		// 수를 입력 받고 그 수가 소수(prime)인지 아닌지 리턴하는 함수를 만들고 호출하세요.
		// 소수이면 true, 소수가 아니면 false를 리턴
		// 단, 입력하는 수는 2 이상
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		System.out.println(PrimeNumber(number));
	}

	// 1.
	public static int Hap(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum = sum + i;
			if (sum > 100) {
				break;
			}
		}
		return sum;
	}

	// 2.
	public static void Minimum(int a1, int a2, int a3, int a4, int a5) {
		int min = a1;
		if (min > a2) {
			min = a2;
		}
		if (min > a3) {
			min = a3;
		}
		if (min > a4) {
			min = a4;
		}
		if (min > a5) {
			min = a5;
		}
		System.out.println("최솟값은 " + min);
	}

	// 3.
	public static boolean PrimeNumber(int num) {
		int count = 0;
		for (int i = 2; i < num; i++) { // 수를 2부터 그 수 직전까지 나눴을때,
			if (num % i == 0) { // 나눠떨어지면(=나머지가 0이면) +1 해라.
				count++;
			}
		} // for문 종료
		if (count == 0) { // count가 0이란 건 한 개도 안나눠떨어졌다는 소리
			return true; // 소수
		} else {
			return false; // 소수가 아님
		}
	}

}
