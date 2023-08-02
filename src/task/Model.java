package task;
class Bike {
	public void rightTurn() {
		System.out.println("Right Turn");
	}
	public void leftTurn() {
		System.out.println("Left Turn");
	}
	public void start() {
		System.out.println("Bike starting");
	}
	public void stop() {
		System.out.println("Stop Bike");
	}
}
class Bike1 extends Bike{
	boolean Abs_breaking=true;
	String name="Hero Splendor Plus";
}
class Bike2 extends Bike{
	boolean Bluetooth_connectivity=true;
	String name2="Yamaha R15";
}
class Bike3 extends Bike{
	boolean Electric=true;
	String name3="Honda cbr 250";
}
class Bike4 extends Bike{
	boolean Modes=true;
	String name4="Royal Enfield Classic";
}
public class Model {

	public static void main(String[] args) {
		Bike1 b1=new Bike1();
		System.out.println("Model name: "+b1.name);
		System.out.println("This bike is having Abs breaking properties: "+b1.Abs_breaking);
		b1.start();
		b1.leftTurn();
		b1.rightTurn();
		b1.stop();
		System.out.println();
		Bike2 b2=new Bike2();
		System.out.println("Model name: "+b2.name2);
		System.out.println("This bike is having Bluetooth connectivity property: "+b2. Bluetooth_connectivity);
		b2.start();
		b2.leftTurn();
		b2.rightTurn();
		b2.stop();
		System.out.println();
		Bike3 b3=new Bike3();
		System.out.println("Model name: "+b3.name3);
	    System.out.println("This bike is having Electric: "+b3.Electric);
	    b3.start();
		b3.leftTurn();
		b3.rightTurn();
		b3.stop();
		System.out.println();
		Bike4 b4=new Bike4();
		System.out.println("Model name: "+b4.name4);
		System.out.println("This bike is having different modes: "+b4.Modes);
		b4.start();
		b4.leftTurn();
		b4.rightTurn();
		b4.stop();

	}

}
