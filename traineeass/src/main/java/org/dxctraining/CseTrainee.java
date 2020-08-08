package org.dxctraining;

public class CseTrainee extends Trainee{
	int numoflang;
	public CseTrainee(int id,String name,int numoflang) {
		super (id,name);
		this.numoflang=numoflang;
	}
	public int getNumoflang() {
		return numoflang;
	}
	public void setNumoflang(int numoflang) {
		this.numoflang = numoflang;
	}
	

}
