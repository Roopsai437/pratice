package org.dxctraining;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Traineemain {
	private Map<Integer,Trainee> map=new HashMap<>();
	public static void main(String[] args) {
		Traineemain run=new Traineemain();
	}
	public void run() {
		map.put(1, (new EceTrainee(1, "sai","multimeter")));
		map.put(2, (new CseTrainee(2, "gopi",3)));
		map.put(3, (new EceTrainee(3,  "sippi","voltmeter")));
		map.put(4, (new CseTrainee(4, "subash",4)));
		Set<Integer> keys = map.keySet();
		for(Integer k:keys) {
			Trainee t=map.get(k);
			if(t instanceof EceTrainee) {
			Set<Trainee>ecet=new HashSet<>();
			ecet.add(t);
			}
			if(t instanceof CseTrainee) {
				Set<Trainee>cset=new HashSet<>();
				cset.add(t);
				}
		}
		display();
	}
	public void display() {
		for(Trainee t:ecet) {
			EceTrainee t1=(EceTrainee)t;
		
			System.out.println("id="+ t1.getId() +"name"+t1.getName()+"device="+ t1.getDeviceused());
		
	}
		for(Trainee c:cset) {
			CseTrainee c1=(CseTrainee)c;
		
			System.out.println("id="+ c1.getId() +"name"+c1.getName()+"device="+ c1.getNumoflang());
		
	}

}
}
