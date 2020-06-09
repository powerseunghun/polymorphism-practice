package lifeGame.model.vo;

public abstract class Language {
	private int need_study;
	private int give_stress;
	private int give_learning_volume;
	private double guard_rate;
	
	public Language() {	}
	
	public Language(int need_study, int give_stress, int give_learning_volume, double guard_rate) {
		this.need_study = need_study;
		this.give_stress = give_stress;
		this.give_learning_volume = give_learning_volume;
		this.guard_rate = guard_rate;
	}

	public int getNeed_study() {
		return need_study;
	}

	public void setNeed_study(int need_study) {
		this.need_study = need_study;
	}

	public int getGive_stress() {
		return give_stress;
	}

	public void setGive_stress(int give_stress) {
		this.give_stress = give_stress;
	}

	public int getGive_learning_volume() {
		return give_learning_volume;
	}

	public void setGive_learning_volume(int give_learning_volume) {
		this.give_learning_volume = give_learning_volume;
	}
	
	public double getGuardRate() {
		return guard_rate;
	}
	
	public void setGuardRate(double guard_rate) {
		this.guard_rate = guard_rate;
	}
	
	public abstract void learning();
	public abstract void guard(); 
}
