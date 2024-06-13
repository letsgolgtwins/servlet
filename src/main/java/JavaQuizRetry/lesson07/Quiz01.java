package JavaQuizRetry.lesson07;

public class Quiz01 {

	public static void main(String[] args) {
		int[][] scores = { { 89, 93, 91, 93, 92, 78, 90, 90, 93, 90 }, { 91, 82, 72, 98, 92, 87, 77, 87, 74, 88 },
				{ 98, 93, 94, 91, 97, 94, 91, 96, 98, 90 }, { 65, 63, 57, 87, 88, 92, 78, 85, 100, 68 },
				{ 45, 50, 48, 63, 67, 58, 40, 66, 47, 64 } };

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
		double maxAverage = 0;
		int maxAverageIndex = 0;
		for (int i = 0; i < scores.length; i++) {
			double sum3 = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum3 += scores[i][j];
			}
			double average = sum3 / scores[i].length;
//			System.out.println(average); 평균
			if (maxAverage < average) {
				maxAverage = average;
				maxAverageIndex = i;
			}
		}
		System.out.println("평균이 가장 높은 학생의 평균 점수는 : " + maxAverage);
		System.out.println("그 학생은 : " + (maxAverageIndex + 1) + "번째 학생");

		// quiz01_4. 특정 과목 최고점 - 4번째 과목의 최고 성적의 학생이 몇 번째 학생인지와 점수를 출력하세요.
		System.out.println();
		int maxScore = 0;
		int maxScoreIndex = 0;
		for (int i = 0; i < scores.length; i++) {
			// int maxScore = scores[i][3];
			if (maxScore < scores[i][3]) {
				maxScore = scores[i][3];
				maxAverageIndex = i;
			}
		}
		System.out.println("4번째 과목의 최고 성적의 학생은 " + (maxAverageIndex + 1) + "번째 학생이고");
		System.out.println("그 점수는 " + maxScore + "점.");

		// quiz01_5. 일부 과목 평균 최고점 - 시험과목 index 3~7 의 평균이 가장 높은 학생을 구하여 출력하세요.
		// 0 1 2 <3 4 5 6 7> 8 9
		System.out.println();
		int maxAvg = 0;
		int maxAvgIndex = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum5 = 0;
			for (int j = 3; j <= 7; j++) {
				// System.out.print(scores[i][j] + " "); 중간점검
				sum5 += scores[i][j];
			}
			System.out.println(sum5);
			maxAvg = i;
		}
		System.out.println("3~7 과목 평균이 가장 높은 학생은 " + (maxAvgIndex + 1) + "번쨰 학생이고, 평균은 " + maxAvg + "입니다.");
		
	}

}
