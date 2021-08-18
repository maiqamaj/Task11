package jo.secondstep.withoutobserve;



public class Test {

	public static void main(String[] args) {
	
		FireSensorAction fire=new FireSensorAction();
		
		SMSNotification smsNotification = new SMSNotification("0779228301");
		FireDepartment fireDepartment=new FireDepartment();
		
		fire.addAction(smsNotification.Action());
		fire.addAction(fireDepartment.Action());
		
		FireSensor fireSensor=new FireSensor();
		 fireSensor.fireDetected(fire);
	
		

	}

	
}
