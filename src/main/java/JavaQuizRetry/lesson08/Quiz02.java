package JavaQuizRetry.lesson08;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 문자열 변환 - 아래 문자열에서 A 를 B로 바꿔서 출력 하세요.
		String gradeStr = "My grade is A";
		String result = gradeStr.replace("A", "B");
		System.out.println(result);

		// 2. 문자열 정수 변환 - 아래와 같이 생년월일이 저장된 String 이 있을때 올해 나이를 출력하세요.
		String birth = "19950721";
		String birthday = birth.substring(0, 4);
		int birthyear = Integer.valueOf(birthday);
		System.out.println("올해 나이는 " + (2025 - birthyear) + "살");

		// 3. 문자열 검색 - 아래 문자열의 단어 개수를 출력 하세요.(중복 포함) 결과:10개
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] word = sentence.split(" ");
		int count = 0;
		for (int i = 0; i < word.length; i++) {
			if (word[i] != null) {
				count++;
			}
		}
		System.out.println("문자열의 개수는 " + count + "개");
	}

}
