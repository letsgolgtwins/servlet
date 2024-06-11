package JavaQuizRetry.lesson02;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 종합문제1. - 평균이 70점 이상이면 합격 그렇지 않으면 불합격
//		System.out.print("두 점수를 입력하세요 : ");
//		int jumsu1 = scan.nextInt();
//		int jumsu2 = scan.nextInt();
//		double average = (jumsu1 + jumsu2) / 2.0;
//		if (average >= 70) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
//		
		// 종합문제2. 큰 값 구하기 세개의 정수중 가장 큰 값 출력
		System.out.print("세 개의 수를 입력하세요 : ");
		int su1 = scan.nextInt();
		int su2 = scan.nextInt();
		int su3 = scan.nextInt();

		int max = su1; // 최댓값 max
		if (su2 > max && su2 > su3) {
			max = su2;
		} else if (su3 > max && su3 > su2) {
			max = su3;
		}
		System.out.println(max);

		// 종합문제3. - 과락 포함 합격 여부
		// 평균이 60점 이상이면 합격 / 한과목이라도 50점 이하면 무조건 과락 / 평균 60점 미만이면 불합격
		System.out.print("점수1 : ");
		int jumsua = scan.nextInt();
		System.out.print("점수2 : ");
		int jumsub = scan.nextInt();
		double average2 = (jumsua + jumsub) / 2.0;

		if (jumsua > 50 && jumsub > 50) {
			if (average2 >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			System.out.println("과락");
		}

		// 종합문제4. 윤년 구하기
		// 4로 나누어 떨어지는 연도는 윤년이다.
		// 100으로 나누어 떨어지는 연도는 윤년이 아니다.
		// 400으로 나누어 떨어지는 연도는 무조건 윤년이다.
		System.out.print("연도 : ");
		int year = scan.nextInt();

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("윤년");
				} else {
					System.out.println("평년");
				}
			} else {
				System.out.println("윤년");
			}
		} else {
			System.out.println("평년");
		}

		// 종합문제5. 윷놀이
		// 0이면 뒤집어 지지 않은 상태, 1이면 뒤집어 진 상태
		// 도 : 1개가 뒤집어진 상태
		// 개 : 2개가 뒤집어진 상태
		// 걸 : 3개가 뒤집어진 상태
		// 윷 : 4개가 뒤집어진 상태
		// 모 : 하나도 뒤집어지지 않은 상태
		System.out.print("윷 상태를 입력하세요 : ");
		int yut1 = scan.nextInt();
		int yut2 = scan.nextInt();
		int yut3 = scan.nextInt();
		int yut4 = scan.nextInt();
		int sum = yut1 + yut2 + yut3 + yut4;
		switch (sum) {
		case 1: {
			System.out.println("도");
			break;
		}
		case 2: {
			System.out.println("개");
			break;
		}
		case 3: {
			System.out.println("걸");
			break;
		}
		case 4: {
			System.out.println("윷");
			break;
		}
		case 0: {
			System.out.println("모");
			break;
		}
		default:
		}

	}

}
