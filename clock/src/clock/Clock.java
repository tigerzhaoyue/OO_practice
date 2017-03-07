package clock;

import display.Display;

public class Clock {
	private Display hour = new Display(24);
	private Display minute = new Display(60);
	
	public void start(){	//	interact with each other
		while(true){
			minute.increase();
			if( minute.getValue() == 0){
				hour.increase();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(),minute.getValue());
		}
	}
	
	public static void main(String[] args) {
		Clock clock = new Clock();
		System.out.println(clock.hour.how_many());
		clock.start();
	}

}
