package jo.secondstep.observer;

public class InternetConnectionMode  implements BattaryActionObserver
{

	@Override
	public void LowAction() {
		System.out.println("Internet disconnected");
		
	}

	@Override
	public void FullAction() {
		// TODO Auto-generated method stub
		
	}

}
