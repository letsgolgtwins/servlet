package JavaQuizRetry.lesson01;

public class Quiz02 {

	public static void main(String[] args) {
		// quiz02_1. 변수 출력
		char a = 'A';
		char b = 'B';
		double aa = 4.0;
		double bb = 3.0;
		System.out.println("시험성적이 90점 이상이면 " + a + "학점이고 평점은 " + aa + "입니다.");
		System.out.println("시험성적이 80점 이상이면 " + b + "학점이고 평점은 " + bb + "입니다.");

		// quiz02_2. 실수 연산
		int number1 = 33;
		double number2 = 35.325;
		System.out.println("두 수의 곱 : " + (number1 * number2));

		// quiz02_3. 943 시간은 몇일 몇시간인지 구하여 출력
		int num1 = 943;
		System.out.println("943시간은 " + (num1 / 24) + "일 " + (num1 % 24) + "시간입니다");

		// quiz02_4. 가로8 세로9인 사각형, 삼각형 넓이 넓이 구하기
		int width = 8;
		int height = 9;
		System.out.println("사각형의 넓이 : " + (width * height));
		System.out.println("사각형의 넓이 : " + (width * height) / 2.0);

	}

}
