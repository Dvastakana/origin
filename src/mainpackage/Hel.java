package mainpackage;

import java.util.Observable;
import java.util.Observer;

public class Hel implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("My name is " + this.getClass().getName() 
				+ ", and I see, how mountain stayd higher on " 
				+ ((Mountain)o).straight);
		
	}

}
