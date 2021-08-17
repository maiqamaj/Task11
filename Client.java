package jo.secondstep.observer;

public class Client {
    
	public static void main(String[] args)
	{
		
		BatteryManager batteryManager= new BatteryManager(10);
		
		Notification notification = new Notification();
		SwicthMode Mode = new SwicthMode();
		InternetConnectionMode wifi =new InternetConnectionMode();
		batteryManager.addAction(notification);
		batteryManager.addAction(Mode);
		batteryManager.addAction(wifi);
		batteryManager.LowBattery();
		
		
		System.out.println("\nCharging ...");
		batteryManager.setChargingRate(100);
		
		batteryManager.addAction(notification);
		batteryManager.addAction(Mode);
		batteryManager.FullBattary();
		
	}
}
