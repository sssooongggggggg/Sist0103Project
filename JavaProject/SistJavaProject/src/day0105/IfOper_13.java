package day0105;

public class IfOper_13 {

	public static void main(String[] args) {
		// 삼항연산자
		//구하려는 값=수식1 ? "참":"거짓"

		//if문과 삼항연산자 비교


		int score = 80; //점수
		char grade; //학점


		/*if (score>=90) {
			grade = "A";

		}
		else if (score>=80) {
			grade = "B";
		}
		else if (score>=70) {
			grade = "C";
		}
		else if (score>=60) {
			grade = "D";
		}
		else {
			grade = "F";
		}*/


		//삼항연산자 하는 방법 

		/* grade = score >= 90 ? 'A' : 
	    	    score >= 80 ? 'B' : 
	    	    	score >= 70 ? 'C' : 
	    	    		score >= 60 ? 'D' : 'F' ; //마칠때만 세미콜론 입력하기


		System.out.println("학점은 " + grade + "입니다.");*/


		switch(score/10) {
		case 10 : case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		case 6 :
			grade = 'D';
			break;
		default :
			grade = 'F';


		}

	}

}
