package task;

//import bill1.Bill;
class Bill {
	String foodName;
	String foodType;
	int quantityAvailable;
	double unitPrice;
	public void total() {
		double totalPrice= quantityAvailable*unitPrice;
		System.out.println("The Total price is: "+totalPrice);
	}
}

public class Resraurant2 {
		public static void main(String[] args) {
			Bill ru = new Bill();
			ru.foodName="Pizza";
			ru.foodType= "Non-veg";
			ru.quantityAvailable = 3;
			ru.unitPrice = 100;
			System.out.println("Foodname: "+ru.foodName);
			System.out.println("Foodtype:"+ru.foodType);
			System.out.println("QyantityAvailable:"+ru.quantityAvailable);
			System.out.println("Unitprice:"+ru.unitPrice);
			ru.total();
		}
	}


