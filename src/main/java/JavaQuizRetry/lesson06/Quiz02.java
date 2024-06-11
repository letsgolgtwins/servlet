package JavaQuizRetry.lesson06;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 배열 값 변경
//		int[] numbers = { 3, 5, 2, 10, 35 };
//		System.out.print("변경할 index와 값을 입력하세요 : ");
//		int index = scan.nextInt();
//		int su = scan.nextInt();
//		for (int i = 0; i < numbers.length; i++) {
//			if (index == i) {
//				numbers[i] = su;
//			}
//			System.out.print(numbers[i] + " ");
//		}

		// 2. 점수 체점 - 100점 만점 기준으로 몇점을 맞았는지 출력하세요.
//		System.out.println();
//		char[] scores = { 'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X' };
//		int sum = 0;
//		for (int i = 0; i < scores.length; i++) {
//			if (scores[i] == 'O') {
//				sum += 10;
//			} else {
//				sum += 0;
//			}
//		}
//		System.out.println(sum + "점");

		// 3. 임금 계산
		// 평일 시급 : 8500원 / 주말(토,일) 시급 : 9500원
//		int[] works = { 3, 5, 5, 3, 5, 3, 5 };
//		int money = 0;
//		int moneyWeekend = 0;
//		for (int i = 0; i < works.length; i++) {
//			if (i <= 4) {
//				money += works[i] * 8500;
//			} else {
//				moneyWeekend += works[i] * 9500;
//			}
//		}
//		System.out.println("일주일간 총 임금은 " + (money + moneyWeekend));

		// 4. 배열 값 변경
		// 길이가 5인 int 배열을 만든다. ㅁ ㅁ ㅁ ㅁ ㅁ
		// 수를 계속 입력 받으면서, 입력 받은 수가 짝수 일때만, 배열에 저장한다.
		// 배열이 가득차면 입력을 중단하고, 저장된 수들을 출력한다.
		int[] arr = new int[5];
		int count = 0;
		while (count < 5) {
			System.out.print("수를 입력하세요 : ");
			int number = scan.nextInt();
			if (number % 2 == 0) {
				arr[count] = number;
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
