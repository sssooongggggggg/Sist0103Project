package day0109;

public class ArraysString_09 {

	public static void main(String[] args) {
		// String 배열
		
		//배열선언
		String [] str;
		str = new String[4];
		
		//초기화
		str[0] = "김구라";
		str[1] = "유재석";
		str[2] = "하하";
		str[3] = "이광수";
		
		//출력
		System.out.println("출력1_ for");
		
		for(int i = 0; i < str.length; i++){
			System.out.println(i + ":" + str[1]);
		}
		System.out.println("==============================================");
		
		System.out.println("출력1_ foreach");
		
		for(String s:str) {
			System.out.println(s);
		}
	}

}
