package _04_hospital;

public class Patient {
	boolean pulseChecked = false;

	public void checkPulse() {
		pulseChecked = true;
	}

	public boolean feelsCaredFor() {
		if (pulseChecked) {
			return true;
		}
		return false;
	}
}
