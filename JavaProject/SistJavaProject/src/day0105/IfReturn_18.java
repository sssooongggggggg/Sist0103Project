package day0105;

import java.util.Scanner;

public class IfReturn_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);

		int score;

		System.out.println("점수 입력(1~100)");
		score =sc.nextInt();


		if(score<1 || score>100) {
			System.out.println("잘못입력했습니다.");
		     return; //예외처리를 두기 위해서 작성 / 현재main 함수 종료의미
		}

		else {
			System.out.println("점수 : " + score);
		}

	}

}
