package jo.secondstep.withoutobserve;

public class SMSNotification {
	 private  String phoneNumber ;
	 
	 public SMSNotification(String phone) {
		 this.phoneNumber=phone;
	}

	
	public String Action()
	 {		return "Send SMS message to "+this.phoneNumber;
}
	  
	    
	 
}
