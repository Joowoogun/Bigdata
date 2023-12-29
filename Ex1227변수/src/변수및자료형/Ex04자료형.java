package 변수및자료형;

public class Ex04자료형 {

	public static void main(String[] args) {
		
		// 자바의 기본 자료형
		// 1) 논리 자료형 : boolean (1byte)
		// : 참 또는 거짓을 저장하는 자료형
		// 참 이라는 데이터를 저장하는 bool 변수 선언
		boolean bool = true;
		// bool 이라는 변수는 참 이다
		bool = false;
		System.out.println(bool);
		
		// 2) 문자 자료형 : char (2byte)
		// : 따옴표를 사용해서 작성하고, 한 글자만 들어갈 수 있다.
		char name = '주';
		
		// 문자열 자료형(기본 자료형이 아님!)
		// String : 쌍따옴표 이용하여 작성, 여러 글자가 들어갈 수 있다.
		String name2 = "주우건";
		
		System.out.println(name);
		System.out.println(name2);
		
		// 3) 정수 자료형
		// byte(1byte), short(2byte), int(4byte), long(8byte)
		// --> 데이터의 크기가 의미하는건 표현할 수 있는 범위
		// 정수를 작성하면 java는 기본적으로 int 로 인식
		
		// 1. 강제 형변환(명시적 형변환)
		// : 큰 크기의 자료형에서 더 작은 크기의 자료형으로 변환할 때 사용하는 형 변환
		//   데이터 손실이 발생할 수 있기 때문에 정확하게 () 사용하여 
		//   손실이 일어나도 괜찮다고 명시해주는 방식
		byte num1 = (byte) 128; 
		//  ---> byte 에 128 안들어감 그래서 형 변환을함
		// 결과 값은 1byte의 최소값으로 나옴 --> -128
		
		// 2. 자동 형변환(묵시적 형변환)
		// : 작은 크기의 자료형이 자동으로 큰 크기의 자료형으로 형 변환
		long num2 = 1000;
		//--> 4byte가 8byte로 자동변환
		System.out.println(num1);
		System.out.println(num2);
		
		// 4) 실수형
		// float, double >> 기본값 double
		// 3.14라는 데이터를 담는 double 형태의 변수 num3 선언
		double num3 = 3.14;
		float num4 = (float) 3.14;
		float num5 = 3.14f;
		// ---> 뒤에 키워드 붙임으로 형변환 할수도있음
		System.out.println(num5);
						
		
		final char my = '주';
		System.out.println(my);
		// my = '마'; 파이널이라 안바뀜
		
		// boolean : 논리 자료형(1byte) >> true, false
		// char : 문자 자료형(2byte) >> 'a' 한글자 저장  
		// ----> String : 여러글자 저장 가능
		// float(4byte),double(8byte) : 실수 double 이 기본
		
		
		

		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
