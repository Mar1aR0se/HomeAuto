package id.ac.sgu;

public class RadioControl extends MediaElectronic {
	private double FmChannel;
	private double AmChannel;
	private boolean radPower;
	
	public RadioControl(int volume) {
		super.setVolume(volume);
	}
	
	public double getFmChannel() {
		return FmChannel;
	}
	
	public void setFmChannel(double fmChannel) {
		this.FmChannel = fmChannel;
	}

	public double getAmChannel() {
		return AmChannel;
	}

	public void setAmChannel(double amChannel) {
		this.AmChannel = amChannel;
	}

	public boolean getRadPower() {
		return radPower;
	}

	public void setRadPower(boolean radPower) {
		this.radPower = radPower;
	}
}