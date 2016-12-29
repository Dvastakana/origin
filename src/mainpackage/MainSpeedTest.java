package mainpackage;

import java.util.Observer;

public class MainSpeedTest {

	public static void main(String[] args){
		
		Observer craig = new Craig();
		Observer hel = new Hel();
		
		Mountain mountain = new Mountain();
		mountain.addObserver(craig);
		mountain.addObserver(hel);
		
		for(int i = 0; i < 10; i++)
		mountain.stayHigher();
	}
	
	
	
}


