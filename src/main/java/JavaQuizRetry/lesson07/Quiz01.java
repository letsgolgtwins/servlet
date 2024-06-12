package JavaQuizRetry.lesson07;

public class Quiz01 {

	public static void main(String[] args) {
		int[][] scores = { 
				{ 89, 93, 91, 93, 92, 78, 90, 90, 93, 90 }, 
				{ 91, 82, 72, 98, 92, 87, 77, 87, 74, 88 },
				{ 98, 93, 94, 91, 97, 94, 91, 96, 98, 90 }, 
				{ 65, 63, 57, 87, 88, 92, 78, 85, 100, 68 },
				{ 45, 50, 48, 63, 67, 58, 40, 66, 47, 64 } 
		};

		// quiz01_1. 학생별 평균 구하기
		for (int i = 0; i < scores.length; i++) {
			double sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			System.out.println((i + 1) + "번째 학생의 평균은 " + sum / scores[i].length);
		}

		// quiz01_2. 학생별 최고점 구하기 - 각 학생의 최고 점수를 구해서 출력하세요.
		System.out.println();
		for (int i = 0; i < scores.length; i++) {
			int max = scores[i][0];
			for (int j = 0; j < scores[i].length; j++) {
				if (max < scores[i][j]) {
					max = scores[i][j];
				}
			}
			System.out.println((i + 1) + "번째 학생의 최고점은 " + max);
		}
		
		// quiz01_3. 평균 최고점 구하기 - 평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.
		// 이 문제부터 이따 다시 풀기
		System.out.println();
		for (int i = 0; i < scores.length; i++) {
			double sum3 = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum3 += scores[i][j];
			}
			double average = sum3 / scores[i].length;
//			System.out.println(average); 평균
		}

	}

}
