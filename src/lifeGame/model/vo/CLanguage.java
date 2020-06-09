package lifeGame.model.vo;

public class CLanguage extends Language {
	
	public CLanguage() { }
	
	public CLanguage(int need_study, int give_stress, int give_learning_volume, double guard_rate) {
		super(need_study, give_stress, give_learning_volume, guard_rate);
	}

	@Override
	public void learning() {
		System.out.println("C언어 학습 성공!");
	}
	
	@Override
	public void guard() {
		System.out.println("C언어 학습 실패!");
	}

}
