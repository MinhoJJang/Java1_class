package Object;

class Student{
	// 멤버변수의 선언 + 할당
	String name = "자바학생";
	int age = 19;
}

public class Main01 {

	public static void main(String[] args) {
		// 객체의 선언과 할당의 분리
		Student std;			// 객체선언
		std = new Student();	// 할당
		
		// 객체의 생성(일괄지정)
		Student std2 = new Student();
		
		System.out.println("이름 : " +  std.name);
		System.out.println("나이 : " +  std.age);
		
		System.out.println("이름2 : " +  std2.name);
		System.out.println("나이2 : " +  std2.age);
		System.out.println("=========================");
		
		std2.name = "객체학생";
		std2.age = 25;
		
		System.out.println("이름2 : " +  std2.name);
		System.out.println("나이2 : " +  std2.age);
		
		System.out.println("이름 : " +  std.name);
		System.out.println("나이 : " +  std.age);
		
	}

}















