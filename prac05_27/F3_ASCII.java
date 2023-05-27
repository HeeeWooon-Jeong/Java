package prac05_27;

public class F3_ASCII {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		
		char start = 'A'; // 시작 알파벳
        char end = 'Z'; // 종료 알파벳

        for (char c = start; c <= end; c++) {
        	
            int decimal = (int) c; // 10진수 아스키코드
            // 65
            String hex = Integer.toHexString(decimal); // 16진수 아스키코드
            // 41 
            String hex2 = String.format("0x%02X", decimal); // 16진수 아스키코드
            // 0x41 형태
            System.out.println("알파벳: " + c + ", 10진수: " + decimal + ", 16진수: " + hex +" " + hex2);
        }
		
		
		
	}

}
