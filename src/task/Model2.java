package task;
class Bikee{
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
		System.out.println("Stop ");
	}
}
class Bikee1 extends Bikee{
	boolean Abs_breaking=true;
	String name="Hero Splendor Plus";
}
class Bikee2 extends Bikee1{
	boolean Bluetooth_connectivity=true;
	String name2="Yamaha R15";
}
class Bikee3 extends Bikee2{
	boolean Electric=true;
	String name3="Honda cbr 250";
}
class Bikee4 extends Bikee3{
	boolean Modes=true;
	String name4="Royal Enfield Classic";
}
public class Model2 {

	public static void main(String[] args) {
		Bikee4 b4=new Bikee4();
		System.out.println("Model name: "+b4.name);
		System.out.println("This bike is having Abs breaking properties: "+b4.Abs_breaking);
		b4.start();
		b4.rightTurn();
		b4.leftTurn();
		b4.stop();
		System.out.println();
		System.out.println("Model name: "+b4.name2);
		System.out.println("This bike is having Bluetooth connectivity property: "+b4.Bluetooth_connectivity);
		b4.start();
		b4.rightTurn();
		b4.leftTurn();
		b4.stop();
		System.out.println();
		System.out.println("Model name: "+b4.name3);
		System.out.println("This bike is having Electric: "+b4.Electric);
		b4.start();
		b4.rightTurn();
		b4.leftTurn();
		b4.stop();
		System.out.println();
		System.out.println("Model name: "+b4.name4);
		System.out.println("This bike is having different modes: "+b4.Modes);
		b4.start();
		b4.rightTurn();
		b4.leftTurn();
		b4.stop();

	}

}
