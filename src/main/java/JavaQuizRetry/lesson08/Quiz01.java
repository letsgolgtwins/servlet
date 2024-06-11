package JavaQuizRetry.lesson08;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 문자열 정수 변환 - 아래와 같이 생년이 저장된 String 이 있을 때 올해 나이를 출력하세요.
		// String birthday = "1995";
		String birthday = "1995";
		int birthyear = Integer.valueOf(birthday);
		System.out.println("올해 나이는 " + (2025 - birthyear) + "살");
	}

}
