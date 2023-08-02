package task;
class BikeModel{
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
class BikeModel2 extends BikeModel{
	boolean Abs_breaking=true;
	String name="Hero Splendor Plus";
	boolean Bluetooth_connectivity=true;
	String name2="Yamaha R15";
	boolean Electric=true;
	String name3="Honda cbr 250";
	boolean Modes=true;
	String name4="Royal Enfield Classic";
}

public class Model3 {

	public static void main(String[] args) {
		BikeModel2 bn=new BikeModel2();
		System.out.println("Model name: "+bn.name);
		System.out.println("This bike is having Abs breaking properties: "+bn.Abs_breaking);
		bn.start();
		bn.rightTurn();
		bn.leftTurn();
		bn.stop();
		System.out.println();
		System.out.println("Model name: "+bn.name2);
		System.out.println("This bike is having Bluetooth connectivity property: "+bn.Bluetooth_connectivity);
		bn.start();
		bn.rightTurn();
		bn.leftTurn();
		bn.stop();
		System.out.println();
		System.out.println("Model name: "+bn.name3);
		System.out.println("This bike is having Electric: "+bn.Electric);
		bn.start();
		bn.rightTurn();
		bn.leftTurn();
		bn.stop();
		System.out.println();
		System.out.println("Model name: "+bn.name4);
		System.out.println("This bike is having different modes: "+bn.Modes);
		bn.start();
		bn.rightTurn();
		bn.leftTurn();
		bn.stop();

	}

}
