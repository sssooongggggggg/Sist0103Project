package day0108;

public class WhileTest_06 {

	public static void main(String[] args) {
		// 1~10까지 반복출력

		int n = 0; // 초기값

		while(n < 10) {
			n++;
			System.out.printf("%4d", n);
		}

		System.out.println();

		n = 0;

		while(n < 10) {
			System.out.printf("%4d",++n); //먼저 증감시키고 반복
		}

		System.out.println();

		n = 0;

		while(true) { //while문에서 조건을 true를 많이 사용
			System.out.printf("%4d",++n);

			//while(true)일 경우에는 수행문장에 반드시 break문으로 조건문을 써주어야 한다.
			if (n == 10) //조건문
				break;


		}



	}

}