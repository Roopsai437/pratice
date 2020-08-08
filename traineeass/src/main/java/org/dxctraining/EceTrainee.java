package org.dxctraining;

public class EceTrainee extends Trainee {
	String deviceused;
	public EceTrainee(int id,String name,String deviceused) {
		super(id,name);
		this.deviceused=deviceused;
	}
	public String getDeviceused() {
		return deviceused;
	}
	public void setDeviceused(String deviceused) {
		this.deviceused = deviceused;
	}

}
