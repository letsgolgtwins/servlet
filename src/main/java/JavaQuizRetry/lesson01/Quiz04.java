package JavaQuizRetry.lesson01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// quiz04_1. 몫과 나머지
		Scanner scan = new Scanner(System.in);
		System.out.print("입력1:");
		int lg = scan.nextInt();
		System.out.print("입력2:");
		int kia = scan.nextInt();
		System.out.println("몫 : " + (lg / kia) + " 나머지 : " + (lg % kia));

		// quiz04_2. 교체 temp 교차 알고리즘
		System.out.print("x:");
		int x = scan.nextInt();
		System.out.print("y:");
		int y = scan.nextInt();

		int temp = 0; // 초기화
		temp = x;
		x = y;
		y = temp;
		System.out.println("x는 " + x + "이고, y는 " + y + " 입니다.");

		// quiz04_3. 초 변환
		System.out.print("초 : ");
		int seconds = scan.nextInt();
		System.out.println((seconds / 60) + "분 " + (seconds % 60) + "초");

		// quiz04_4. 자리수 쪼개기
		System.out.print("입력 : ");
		int su = scan.nextInt();
		int thousand = su / 1000;
		int hundred = (su - (thousand * 1000)) / 100;
		int ten = (su - ((thousand * 1000) + (hundred * 100))) / 10;
		int one = su - ((thousand * 1000) + (hundred * 100) + (ten * 10));
		System.out.println(thousand);
		System.out.println(hundred);
		System.out.println(ten);
		System.out.println(one);

		// quiz04_5. 자리수 합 구하기
		System.out.println("합계는 " + (thousand + hundred + ten + one) + "입니다.");
	}

}
