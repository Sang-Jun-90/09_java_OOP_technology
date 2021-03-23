package step9_01.OOP_Theory;
/*

# 메서드 오버라이딩 ( Method Overriding )

- 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
- 메서드 오버로딩과 혼용되기 쉽다.

*/

class Worrior2 extends Charactor {
	
	// 메서드 오버라이딩(메소드 재정의)
	void levelUp() {
		this.level++;
		this.power +=100;
		this.dex += 500;
		this.life += 1000;
		this.mana += 500;
		System.out.println("레벨업하셨습니다 현재레벨 : " + this.level);
	}
	// Worrior2 클래스만의 메서드 추가
	void dash() {
		
		System.out.println("# dash!");
	}
}

class Wizard2 extends Charactor {
	// 메서드 오버라이딩(메소드 재정의)
	void levelUp() {
		this.level++;
		this.power +=100;
		this.dex += 500;
		this.life += 1000;
		this.mana += 500;
		System.out.println("레벨업하셨습니다 현재레벨 : " + this.level);
	}
	// Wizard2 클래스만의 메서드 추가
	void fireball() {
		
		System.out.println("# fireball!");
	}
}

public class OOPEx03 {

	public static void main(String[] args) {

		Worrior2 w3 = new Worrior2();
		
		w3.showStatus();
		w3.levelUp();
		w3.showStatus();
		w3.dash();
		
		System.out.println();
		
		Wizard2 w4 = new Wizard2();
		
		w4.showStatus();
		w4.levelUp();
		w4.showStatus();
		w4.fireball();
		
		System.out.println();
		
	}

}
