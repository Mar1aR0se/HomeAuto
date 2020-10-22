package id.ac.sgu;

public class CameraControl {
	private boolean takeShot;
	private boolean movement;

	public boolean isTakeShot() {
		return takeShot;
	}

	public void setTakeShot(boolean takeShot) {
		this.takeShot = takeShot;
	}

	public boolean isMovement() {
		return movement;
	}

	public void setMovement(boolean movement) {
		this.movement = movement;
	}
}