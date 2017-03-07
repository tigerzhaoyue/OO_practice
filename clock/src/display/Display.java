package display;
//can show 2-bit number
public class Display {
	private int value = 0;
	private int limit = 0;
	private static int num_of_display = 0 ;
	
	public Display(int limit){
		this.limit = limit;
		num_of_display ++;
	}
	
	public void increase(){
		value++;
		if( value == limit){
			value = 0;
		}
	}
	
	public int getValue(){
		return value;
	}
	
	public int how_many()
	{
		return num_of_display;
	}
	public static void main(String[] args) {
		Display d = new Display(24);
		for ( ; ;){
			d.increase();
			System.out.println(d.getValue());
		}
	}
}
