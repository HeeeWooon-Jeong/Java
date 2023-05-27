package prac05_27;

public class F1_홀수_짝수 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁

		// 완성

		int[] odd = new int[50];
		int[] even = new int[50];

		for (int i = 0, oddNum = 1, evenNum = -2; i < odd.length; i++, oddNum += 2, evenNum -= 2) {
			odd[i] = oddNum;
			even[i] = evenNum;
			System.out.println("홀수: " + odd[i] + ", 짝수: " + even[i]);
		}
		int oddSum = 0;
		int evenSum = 0;

		for (int odd2 : odd) {
			oddSum += odd2;
		} // 2500 = 1~100 까지 홀수의 합

		for (int even2 : even) {
			evenSum += even2;
		}
		System.out.println();
		System.out.println("결과 : " + (oddSum + evenSum));

		
		
		// 풀이

		int[] odd = new int[50];
		int[] even = new int[50];

		// 짝수만 뽑는 단순 연산 배열 대입
		for (int i = 0, num = 1; i < odd.length; i++, num += 2) {
			odd[i] = num;

		}
		// 홀수만 뽑는 단순 연산 배열 대입
		for (int i = 0, num = -2; i < even.length; i++, num -= 2) {
			even[i] = num;
		}

		// for문 한번으로 줄이기

		/*
		 * 
		 * for (int i = 0, oddNum = 1, evenNum = -2; i < odd.length; i++, oddNum += 2,
		 * evenNum -= 2) { odd[i] = oddNum; even[i] = evenNum; System.out.println("홀수: "
		 * + odd[i] + ", 짝수: " + even[i]); }
		 * 
		 */

		// 출력
		for (int j = 0; j < 50; j++) {
			System.out.print(odd[j] + " " + even[j] + " ");
		}

		// for문 으로 합
		int sumodd = 0;
		int sumeven = 0;

		for (int i = 0; i < odd.length; i++) {
			sumodd += odd[i];
		}

		for (int i = 0; i < even.length; i++) {
			sumeven += even[i];
		}

		// 배열의 합 향상된 for문

		int oddSum = 0;
		int evenSum = 0;

		for (int odd2 : odd) {
			oddSum += odd2;
		} // 2500 = 1~100 까지 홀수의 합

		for (int even2 : even) {
			evenSum += even2;
		} // 2550 = 1~100 까지 짝수의 합 코드상에서는 -

	}

}
