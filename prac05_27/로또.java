package prac05_27;

import java.util.Arrays;
import java.util.Random;

public class 로또 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		
		


		// 로또
		
		int[] array = new int[5];
		Random ran = new Random();

		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호");


	        int[] arr = new int[5];

	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = ran.nextInt(10) + 1;
	            
	            for (int j = 0; j < i; j++) {
	                if (arr[i] == arr[j]) {
	                    i--;

	                }
	            }

	        }
	        System.out.println(Arrays.toString(arr));
	     

		// 로또
		


	}
}
