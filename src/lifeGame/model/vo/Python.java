package lifeGame.model.vo;

public class Python extends Language {
	public Python() { }
	
	public Python(int need_study, int give_stress, int give_learning_volume, double guard_rate) {
		super(need_study, give_stress, give_learning_volume, guard_rate);
	}
	
	@Override
	public void learning() {
		System.out.println("Python 학습 성공!");
	}
	
	@Override
	public void guard() {
		System.out.println("Python 학습 실패!");
	}

	
}
