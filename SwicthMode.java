package jo.secondstep.observer;

public class SwicthMode implements BattaryActionObserver
{

	@Override
	public void LowAction() {
		System.out.println("Change Mode fo Safe Mode  ");
		
	}

	@Override
	public void FullAction() {
		
		System.out.println("Original Mode ");

	}

}