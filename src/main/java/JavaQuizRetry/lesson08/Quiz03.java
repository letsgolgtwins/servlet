package JavaQuizRetry.lesson08;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 문자열 입력 - id를 입력 받고, 아래와 같이 환영 메시지를 출력하세요.
		// Welcome! {id}
//		System.out.print("ID를 입력하세요 : ");
//		String id = scan.next();
//		System.out.println("Welcome! " + id);

		// 2. 문자열 검색 - 영어 단어를 입력 받고 'e' 가 몇 개 들어 있는지 출력 하세요.
		System.out.print("단어를 입력하세요 : ");
		String word = scan.next();
		String[] wordArr = word.split("");
		int count = 0;
		for (int i = 0; i < wordArr.length; i++) {
			if (wordArr[i].equals("e")) {
				count++;
			} else {

			}
		}
		System.out.println("e의 개수는 " + count + "개 입니다.");
	}

}
