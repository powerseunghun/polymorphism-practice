package lifeGame.controller;

import java.util.Scanner;

import lifeGame.model.vo.CLanguage;
import lifeGame.model.vo.JAVA;
import lifeGame.model.vo.Language;
import lifeGame.model.vo.Player;
import lifeGame.model.vo.Python;

public class Controller {
	
	// 플레이어
	Player user;
	Language language;
	public Controller() {}
	
	public Controller(Player user) {
		this.user = user;
	}
	
	public void learning() {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		if(user.getStress() > 100) {
			System.out.println("스트레스를 너무 많이 받았습니다. 일단 휴식하세요");
			return;
		}
		do {
			System.out.println("1. Python");
			System.out.println("2. C언어");
			System.out.println("3. JAVA");
			System.out.println("4. 종료");
			System.out.print("어떤 언어를 학습하시겠습니까? : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				battle(this.user, new Python(0, 30, 5, 0.1));
				break;
			case 2:
				battle(this.user, new CLanguage(20, 40, 15, 0.3));
				break;
			case 3:
				battle(this.user, new JAVA(60, 60, 50, 0.8));
				break;
			case 4:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("올바른 메뉴가 아닙니다.");
				break;
			}
		} while(true);
	}

	public void battle(Player user, Language language) {
		if (user.getLearning_volume() < language.getNeed_study()) {
			System.out.println("아직 너무 어렵습니다.");
			return;
		}
		
		else {
			int count = 0;
			while (count < 5) {
				int guard_rate = (int) (language.getGuardRate() * 100);
				int attack = (int) (Math.random() * 100) + 1;
				if (attack <= guard_rate) {
					language.guard();
				}
				else {
					language.learning();
					count++;
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("학습을 완료하였습니다!");
		user.setLearning_volume(user.getLearning_volume() + language.getGive_learning_volume());
		user.setStress(user.getStress() + language.getGive_stress());
	}
}
