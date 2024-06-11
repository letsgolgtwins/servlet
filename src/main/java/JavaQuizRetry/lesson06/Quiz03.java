package JavaQuizRetry.lesson06;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 위치 변경 swap - 두 개의 index를 입력받은다음, 서로 교체해서 배열 출력
//		int[] numbers = { 3, 5, 2, 10, 39 };
//		System.out.print("두 개의 index를 입력하세요 : ");
//		int index1 = scan.nextInt();
//		int index2 = scan.nextInt();
//		
//		int temp = numbers[index1];
//		numbers[index1] = numbers[index2];
//		numbers[index2] = temp;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}

		// 2. 배열 순서 변경
		// 1 ~ 10 까지 차례로 저장된 배열을 만들고, 순서를 뒤섞어서 그 결과를 출력하세요.
		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			int randIndex = rand.nextInt(10);
			int temp = number[0];
			number[0] = number[randIndex];
			number[randIndex] = temp;
		}
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

		// 3. 빈도수 구하기
		// 1 ~ 5 범위 안에 숫자가 배열에 중복되어 저장되어있다.
		// 1 ~ 5 까지의 숫자가 각각 몇 개씩 저장되어 있는지 출력하세요.
//		System.out.println();
//		int[] numbers3 = { 5, 3, 2, 1, 2, 4, 3, 3, 2, 1 };
//		int one = 0;
//		int two = 0;
//		int three = 0;
//		int four = 0;
//		int five = 0;
//		for (int i = 0; i < numbers3.length; i++) {
//			if (numbers3[i] == 1) {
//				one++;
//			} else if (numbers3[i] == 2) {
//				two++;
//			} else if (numbers3[i] == 3) {
//				three++;
//			} else if (numbers3[i] == 4) {
//				four++;
//			} else {
//				five++;
//			}
//		}
//		System.out.println("1 : " + one + "개");
//		System.out.println("2 : " + two + "개");
//		System.out.println("3 : " + three + "개");
//		System.out.println("4 : " + four + "개");
//		System.out.println("5 : " + five + "개");
	}

}
