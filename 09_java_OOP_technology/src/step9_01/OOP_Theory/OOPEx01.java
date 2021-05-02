package step9_01.OOP_Theory;

/*
 * 
 * # toString
 * 
 * - 객체의 주소를 문자열 형태로 반환한다.
 * - 주로 객체에 관한 정보를 담는 목적으로 사용한다.
 * 
 * */

class Test1{}
class Test2{

	@Override
	public String toString() {
		return "객체에 관한 정보";
	}
	
}

class Test3 {
	
	String name;
	int age;
	
	public Test3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 자동완성 기능 : 이클립스 좌측상단 source 에서 제너레이트에서 진행가능
	@Override
	public String toString() {
		return "Test3 [name=" + name + ", age=" + age + "]";
	}

	
}






public class OOPEx01 {

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		System.out.println(t1);		// 객체의 주소가 콘솔에 출력된다.
		
		Test1 t2 = new Test1();
		System.out.println(t2);		// 객체의 주소가 콘솔에 출력된다.
		
		System.out.println("====================");
		
		Test2 t3 = new Test2();
		System.out.println(t3);	// toString() 메서드의 return값이 콘솔에 출력된다.
		
		Test2 t4 = new Test2();
		System.out.println(t4); // toString() 메서드의 return값이 콘솔에 출력된다.
		
		
		Test3 t5 = new Test3("팀 버너스 리", 50); // toString() 메서드의 return값이 콘솔에 출력된다.
		System.out.println(t5);
		Test3 t6 = new Test3("라이언 고슬링", 55); // toString() 메서드의 return값이 콘솔에 출력된다.
		System.out.println(t6);
		
		
	}

}
