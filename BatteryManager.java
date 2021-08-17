package jo.secondstep.observer;

import java.util.ArrayList;
import java.util.List;

public class BatteryManager {
	
	 private List<BattaryActionObserver>  lowOserver= new ArrayList<>();
	 private List<BattaryActionObserver>  FullObserver= new ArrayList<>();
	 
	public int chargingRate;
	
	public void setChargingRate(int Rate)
	{this.chargingRate=Rate;
		
	}
	  public BatteryManager(int chargingRate) {this.chargingRate=chargingRate;}

	 public void addAction(BattaryActionObserver battaryActionObserver)
	 {  if (this.chargingRate<20)
	 { lowOserver.add(battaryActionObserver);}
	 else if (this.chargingRate==100)
	 {
		 
		 FullObserver.add(battaryActionObserver);
	 }
	 
	 }
	 
	 
	 public void RemoveAction(BattaryActionObserver battaryActionObserver)
	 {
		 if (this.chargingRate<20)
		 { lowOserver.remove(battaryActionObserver);}
		 else if (this.chargingRate==100)
		 {
			 
			 FullObserver.remove(battaryActionObserver);
		 }
		 
	 }
	 
	 public void LowBattery()
	 
	 {
		 for(BattaryActionObserver battaryActionObserver : lowOserver)
		 {
			 battaryActionObserver.LowAction();
		 }
		 
	 }
	 
 public void FullBattary()
	 
	 {
		 for(BattaryActionObserver battaryActionObserver : FullObserver)
		 {
			 battaryActionObserver.FullAction();
		 }
		 
	 }
	 
	 
  
}
