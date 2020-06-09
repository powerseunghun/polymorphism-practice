package lifeGame.model.vo;

import java.util.Scanner;

public class Player {
	private String name;
	private int learning_volume;
	private int stress;
	
	public Player() { } {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		this.name = sc.nextLine();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLearning_volume() {
		return learning_volume;
	}

	public void setLearning_volume(int learning_volume) {
		this.learning_volume = learning_volume;
	}

	public int getStress() {
		return stress;
	}

	public void setStress(int stress) {
		this.stress = stress;
	}
	
	public void status() {
		System.out.println("========================");
		System.out.println("이름 : " + this.getName());
		System.out.println("학습량 : " + this.getLearning_volume());
		System.out.println("스트레스 : " + this.getStress());
		System.out.println("========================");
	}
	
	public int attack() {
		return 0;
	}
}
