package JavaQuizRetry.lesson08;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 문자열 검색 - 파일이름이 저장된 문자열 배열에서 jpg 파일이 몇개인지 출력하세요.
		// <출력예시> jpg 파일 개수 : 3
		String[] files = { "cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg" };
		int count = 0;
		for (int i = 0; i < files.length; i++) {
			if (files[i].contains(".jpg")) {
				count++;
			}
		}
		System.out.println("jpg 파일 개수 : " + count);

		// 2. 영 단어 퀴즈
		// 영어 단어 퀴즈를 낸다.
		// 아래와 같이 4개의 문제를 출제하고, 문자열로 차례차례 입력을 받는다.
		// 100점 만점 기준으로 몇점인지 출력한다.
		// <출력예시> 점수는 75점 입니다.
//		int score = 0;
//		System.out.print("1. 승리를 영어로 입력하세요 : ");
//		String victory = scan.next();
//		System.out.print("2. 사랑을 영어로 입력하세요 : ");
//		String love = scan.next();
//		System.out.print("3. 컴퓨터를 영어로 입력하세요 : ");
//		String computer = scan.next();
//		System.out.print("4. 노트북을 영어로 입력하세요 : ");
//		String notebook = scan.next();
//		if (victory.equals("victory")) {
//			score++;
//		} else {
//
//		}
//		if (love.equals("love")) {
//			score++;
//		} else {
//
//		}
//		if (computer.equals("computer")) {
//			score++;
//		} else {
//
//		}
//		if (notebook.equals("notebook")) {
//			score++;
//		} else {
//
//		}
//		System.out.println("점수는 " + (score * 25) + "점 입니다.");

		// 3. 동명이인 수 구하기
		// 동명이인 종류: 송강호, 이민정, 이정재 => 3
		// <출력예시> 동명이인 종류 수:3
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] member = memberStr.split(":");
		int resultCount = 0;
		for (int i = 0; i < member.length - 1; i++) {
			int sameCount = 0;
			for (int j = i + 1; j < member.length; j++) {
				if (member[i].equals(member[j])) {
					sameCount++;
				}
			}
			if (sameCount == 1) {
				resultCount++;
			}
		}
		System.out.println("동명이인 종류 수: " + resultCount);
	}

}
