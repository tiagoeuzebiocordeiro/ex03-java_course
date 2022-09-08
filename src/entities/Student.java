package entities;

public class Student {

	public String name;
	public double firstScore;
	public double secondScore;
	public double thirdScore;
	
	public double finalScore() {
		return firstScore + secondScore + thirdScore;
	}
	
	public double result() {
		if (finalScore() < 60.0) {
			return 60.0 - finalScore();
		} else {
			return 0.0;
		}
	}
	
}
