package step9_01.OOP_Theory;

/*
 * 
 *  # 상속
 * 
 *  - 클래스간의 부모자식관계를 설정해서 클래스를 광범위하게 사용이 가능하다.
 *  
 *  - 단일 상속만 가능하다. ( 다중상속 불가 )
 *    Ex) Class A extends B,C,D,E  (불가능)
 *
 *  - 모든 클래스는 Object클래스를 상속받은 상태에서 시작한다.
 *    
 *  - [ 호칭 ]  
 *  
 *  	> 부모 , 상위 , 슈퍼 , 기반 클래스  
 *  	> 자식 , 하위 , 서브 , 파생 클래스
 *
 *  - [ 형식 ]
 * 
 *   	class 자식클래스 이름 extends 부모클래스이름 {
 *   
 *   	}
 * 
 * */

class Charactor {
	int level = 1;
	int power = 10;
	int dex = 10;
	int life = 10;
	int mana = 10;
	
	void levelUp() {
		this.level++;
		this.power+=10;
		this.dex+=10;
		this.life+=10;
		this.mana+=10;
		System.out.println("레벨업하셨습니다 현재레벨 : " + this.level);
	}
	void showStatus() {
		System.out.println("# level : " + this.level);
		System.out.println("# power : " + this.power);
		System.out.println("# dex : " + this.dex);
		System.out.println("# life : " + this.life);
		System.out.println("# mana : " + this.mana);
		System.out.println();
	}
	
}

class Worrior extends Charactor {
	
}

class Wizard extends Charactor {
	
}

public class OOPEx02 {

	public static void main(String[] args) {

		Wizard w1 = new Wizard();
		
		w1.showStatus();
		w1.levelUp();
		w1.showStatus();
		
		System.out.println();
		
		Worrior w2 = new Worrior();
		
		w2.showStatus();
		w2.levelUp();
		w2.levelUp();
		w2.levelUp();
		w2.showStatus();
		
		
	}

}
