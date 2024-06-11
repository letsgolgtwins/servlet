package JavaQuizRetry.lesson01;

public class Quiz03 {

	public static void main(String[] args) {
		// quiz03_1. 평균 구해서 소수점 둘째자리 까지 출력
		// 국어 : 93 수학 : 88 영어 : 94
		int korean = 93;
		int math = 88;
		int english = 94;
		int sum = korean + math + english;
		double average = sum / 3.0;

		System.out.println("국어 " + korean + "점, 수학 " + math + "점, 영어 " + english + "점");
		System.out.println("평균 : " + (double) (Math.round(average * 100)) / 100);

		// quiz03_2. 섭씨 30도의 화씨 온도 구하기
		// 공식) 화씨 온도 = 9 / 5 * 섭씨온도 + 32
		int c = 30;
		double f = (double) 9 / 5 * c + 32;
		System.out.println("섭씨 " + c + "도는 화씨 " + f + "도 입니다.");

	}

}
