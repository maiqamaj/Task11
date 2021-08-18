package jo.secondstep.withoutobserve;

import java.util.ArrayList;
import java.util.List;


public class FireSensorAction {
	
	 private List<String>  Actions= new ArrayList<>(); 
	
	
	public void addAction(String action)  {
		 Actions.add(action);
	 }
	 
	public  void removeAction(String action) {
		Actions.remove(action);
     
	}
	
	public void Action() {
		for (String action: Actions) {
		    System.out.println(action);
		}
	}


	 
}
