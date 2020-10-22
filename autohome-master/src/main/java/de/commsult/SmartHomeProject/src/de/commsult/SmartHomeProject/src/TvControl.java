package de.commsult.SmartHomeProject.src.de.commsult.SmartHomeProject.src;

public class TvControl extends MediaElectronic {
	private int onDemandChannel;
	private int normalChannel;
	private boolean tvPower;
	
	public int getOnDemandChannel() {
		return onDemandChannel;
	}
	
	public void setOnDemandChannel(int onDemandChannel) {
		this.onDemandChannel = onDemandChannel;
	}

	public int getNormalChannel() {
		return normalChannel;
	}

	public void setNormalChannel(int normalChannel) {
		this.normalChannel = normalChannel;
	}

	public boolean getTvPower() {
		return tvPower;
	}

	public void setTvPower(boolean tvPower) {
		this.tvPower = tvPower;
	}
}