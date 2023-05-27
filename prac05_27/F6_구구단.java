package prac05_27;

import java.util.Scanner;

public class F6_구구단 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수입력 : ");
		int num1 = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int num2 = sc.nextInt();
		System.out.println(num1+"단");
		
		int d = 0;
		
		for (int i = 1; i < num2+1; i++) {
			d = i;
			System.out.println(num1 + "*"+ d +"=" +num1*d);
		}
		sc.close();
		
		
		
		
		
		
	}

}
