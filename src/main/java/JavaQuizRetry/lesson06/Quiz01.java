package JavaQuizRetry.lesson06;

public class Quiz01 {

	public static void main(String[] args) {
		int[] numbers = { 3, 8, 9, 4, 2, 1, 7, 5 };
		// 1. 배열 값 접근 - 배열의 4번째 값을 6으로 바꾸세요.
		numbers[3] = 6;

		// 2. 배열 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}

		// 3. 배열 역순 출력
		System.out.println();
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}

		// 4. 배열 출력 - 배열의 짝수번째 위치에 있는 값들을 출력하세요.
		System.out.println();
		for (int i = 1; i < numbers.length; i += 2) {
			System.out.print(numbers[i] + " ");
		}

		// 5. index - 배열의 값 중 2가 들어 있는 index를 출력하세요.
		System.out.println();
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.print("2가 들어있는 index는 " + i);
			}
		}

		// 6. 최대값
		System.out.println();
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.print("최대값은 " + max);

		// 7. 최솟값 index
		System.out.println();
		int min = numbers[0];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
				index = i;
			}
		}
		System.out.print("최솟값의 index는 " + index);

		// 8. 평균
		System.out.println();
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.print("평균은 " + (double) (sum / numbers.length));
	}

}
