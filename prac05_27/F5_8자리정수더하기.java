package prac05_27;

import java.util.Scanner;

public class F5_8자리정수더하기 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		// 8자리 8번 반복
		// 작업후 반복 /=10 이 1의 자리수를 없앰 1의자리수만 반복적으로 구한후 += 대입
		for (int i = num; i != 0 ; i/= 10) { 
			sum += i%10;
			
		}
		
		
		sc.close();
		System.out.print("합은 "+ sum + "입니다.");
		
		
	}

}
