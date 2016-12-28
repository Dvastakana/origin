package mainpackage;

import java.util.Observable;

public class Mountain extends Observable{
	
	int straight = 0;
	
	void stayHigher(){
		straight++;
		this.setChanged();
		this.notifyObservers();
	}

}
