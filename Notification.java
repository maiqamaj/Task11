package jo.secondstep.observer;

public class Notification implements BattaryActionObserver
{

	@Override
	public void LowAction() {
		System.out.println("Battary Low ");
		
	}

	@Override
	public void FullAction() {
		System.out.println("Battery fully charged");
		
	}

}
