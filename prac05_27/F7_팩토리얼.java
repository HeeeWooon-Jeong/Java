package prac05_27;

import java.util.Scanner;

public class F7_팩토리얼 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int in = sc.nextInt();
		
		int fac = 1;
		for (int i = 1; i < in+1; i++) {
			fac *= i;
		}
		
		System.out.println("출력 : " + fac);
				
		
		
	}

}
