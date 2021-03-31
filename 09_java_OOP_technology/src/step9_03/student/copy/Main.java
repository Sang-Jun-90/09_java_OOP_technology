package step9_03.student.copy;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			Controller controller = new Controller();
		
			while (true) {
			
				System.out.print("[1]추가 [2]수정 [3]삭제 [4]출력 [5]전체출력 [6]종료 : ");
				int selectMenu = scan.nextInt();
				
				if (selectMenu == 1) {
					
				}
				else if (selectMenu == 2) {
					
				}
				else if (selectMenu == 3) {
					
				}
				else if (selectMenu == 4) {
					
				}
				else if (selectMenu == 5) {
					
				}
				else if (selectMenu == 6) {
					
					System.out.println("종료");
					scan.close();
					break;
					
				}
			
			}
			
		
		
	}

}
