package lifeGame.view;

import java.util.Scanner;

import lifeGame.controller.Controller;
import lifeGame.model.vo.Player;

public class GameMenu {
	Player user;
	
	public GameMenu() {	}
	
	public GameMenu(Player user) {
		this.user = user;
	}
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		do {
			System.out.println("1. 현재 상태 보기");
			System.out.println("2. 공부하기");
			System.out.println("3. 휴식하기");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
					
			switch(menu) {
			case 1:
				user.status();
				break;
			case 2:
				new Controller(user).learning();
				break;
			case 3:
				System.out.println("휴식합니다..");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (user.getStress() <= 50) {
					user.setStress(0);
				}
				else {
					user.setStress(user.getStress() - 50);
				}
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("올바른 메뉴가 아닙니다.");
				break;
			}
		} while(true);
	}
}
