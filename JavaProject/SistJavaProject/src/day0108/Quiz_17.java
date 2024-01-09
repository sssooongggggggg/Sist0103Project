package day0108;

import java.net.Socket;
import java.util.Scanner;

public class Quiz_17 {

	public static void main(String[] args) {

		//quiz_1();
		quiz_2();
	}

	public static void quiz_1() {

		//Q. 반복해서 숫자를 입력하여 양수의 갯수와 음수의 갯수를 구하시오. (0입력시 종료)
		/* 
		 * 6
		 * -10
		 * 88
		 * 120
		 * -130
		 * 0
		 * 양수의 갯수 : 3개
		 * 음수의 갯수 : 2개
		 */

		Scanner in = new Scanner(System.in);


		int x;
		int y = 0; //양
		int z = 0; //음



		while(true) { 

			System.out.println("숫자 입력 : ");
			x = in.nextInt();


			if (x > 0) {
				y += 1;
			}else if(x < 0) {
				z += 1;
			}else {
				System.out.println("시스템 종료");
				break; //while문은 break를 걸어줘야 계속 반복되는걸 방지
			}

		}System.out.println("양의 갯수 : " + y);
		System.out.println("음의 갯수 : " + z);


	}

	public static void quiz_2() {

		/*
		 * 반복해서 점수를 입력하고 (1~100) 0을 입력시 빠져나와 총 갯수와 합계와 평균를 구하시오. 범위에 맞지 않는 점수는 횟수에서
		 * 제외되어야 한다.
		 */


		Scanner in = new Scanner(System.in);



		int score;
		int sum = 0;
		int cnt = 0;


		while(true) {

			System.out.println("점수 입력 : ");
			score = in.nextInt();

			if(1 <= score && score <=100) {
				cnt += 1;
				sum += score;

			} else if (score == 0 ) {
				System.out.println("시스템 종료!!");
				break;
			}
		}

		System.out.println("갯수는 : " + cnt + ", 합계는 : " + sum + ", 평균은 : " + ((double) sum / cnt));


	}  


	public static void quiz_3() {

		/*
		 * 반복해서 점수를 입력하고 (1~100) 0을 입력시 빠져나와 총 갯수와 합계와 평균를 구하시오. 범위에 맞지 않는 점수는 횟수에서
		 * 제외되어야 한다.
		 */
		
		Scanner in = new Scanner(System.in);
		
		int score; // 입력값
		int cnt = 0; // 갯수
		int sum = 0; // 합계
		
		
		while(true) {
			System.out.println("점수 입력 : ");
			score = in.nextInt();
			
			if(1 >= score && score <= 100) { // 1~100까지를 입력하는 조건문을 게시
				cnt += 1; // 갯수
				sum += score; // 합계 (입력값을 받은 점수를 다 합하는것)
				
			} else if(score == 0) { //0을 입력시 프로그램 종료에 대한 조건문 게시
				System.out.println("시스템 종료!!!"); 
				break; //반복문에는 브레이크적용
			}
			
		}
		System.out.println("총 갯수는 " + cnt + ", 합계는 : " + sum + ", 평균 : " + ((double) sum / cnt ));
		
	}


}
