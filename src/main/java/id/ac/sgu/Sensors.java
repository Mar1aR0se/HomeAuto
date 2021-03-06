package id.ac.sgu;

public class Sensors {
	private boolean lightSensor;//true = light sensor detects light
	private double weightSensor;
	private double temperatureSensor;
	private boolean anemometer; //false = wind speed is normal
	private boolean brightCtrl;
	//private boolean airConSensor;
	
	public boolean getLightSensor() {
		return lightSensor;
	}
	
	public void setLightSensor(boolean lightSensor) {
		this.lightSensor = lightSensor;
	}

	public double getWeightSensor() {
		return weightSensor;
	}

	public void setWeightSensor(double weightSensor) {
		this.weightSensor = weightSensor;
	}

	public double getTemperatureSensor() {
		return temperatureSensor;
	}

	public void setTemperatureSensor(double temperatureSensor) {
		this.temperatureSensor = temperatureSensor;
	}

	public boolean getAnemometer() {
		return anemometer;
	}

	public void setAnemometer(boolean anemometer) {
		this.anemometer = anemometer;
	}

	public boolean getBrightCtrl() {
		return brightCtrl;
	}

	public void  setBrightCtrl(boolean brightCtrl) {
		this.brightCtrl = brightCtrl;
	}

	//public boolean getAirConSensor(){
	//	return airConSensor;
	//}

//	public void setAirConSensor(boolean airConSensor){
//		this.airConSensor = airConSensor;
//	}

}