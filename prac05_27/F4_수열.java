package prac05_27;

import java.util.Scanner;

public class F4_수열 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		//수열
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		
		int n = sc.nextInt();
		
		// 대입할 변수 지정 
		int a = 1;
		 
		// 1씩 증가하여 +
		for (int i = 0; i < n; i++) {
			a += i;
			System.out.print(a+" ");
		}
		
	}

}
