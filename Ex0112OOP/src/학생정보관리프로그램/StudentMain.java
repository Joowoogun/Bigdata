package 학생정보관리프로그램;

public class StudentMain {

	public static void main(String[] args) {
		
		// Student 자료형 stu1 객체 생성
		Student stu1 = new Student();
		
		stu1.setName("임경남");
		stu1.setNumber("20220458");
		stu1.setAge(20);
		stu1.setScoreJava(90);
		stu1.setScoreWeb(25);
		stu1.setScoreAndroid(50);
		// 이름, 자바 점수 출력
		System.out.println("이름: "+ stu1.getName()+" | 자바점수: "+ stu1.getScoreJava());
		// 메소드 이름 위에 마우스 올려서 포스트잇 모양이 뜨면
		// 초록색 동그라미 오른쪽에 있는 자료형이 리턴타입을 의미한다.
		
		
		
		// Student 자료형 stu2 객체 생성
		Student stu2 = new Student("주우건", "20150914", 29);
		// new Student() ---> 객체를 생성하는 순간에 실행되는 메소드!
		// ***생성자(Constructor)***
		
		
		
		System.out.println(stu2.getName()+"  "+stu2.getAge());
	}

}
