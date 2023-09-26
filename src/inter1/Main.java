package inter1;

public class Main implements Car,Bike{

	public static void main(String[] args) {
		Main m = new Main();
		 m.engine();
		 m.speed();
	}

	@Override
	public void engine() {
		System.out.println("fourstock engine");
		
	}

	@Override
	public void speed() {
	  System.out.println("speed is:"+rpm);
		
	}

}
