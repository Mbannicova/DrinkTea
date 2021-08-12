
public class CupDrink {

	public static void main(String[] args) {
	Cup.printInfo();

	}

}
///////////////////////////////////////////////////////////
// parent class
class Cup {
	static int volume_mL = 500;
	
	static void printInfo() {
		int fill  = 100 * Drink.volume_mL / volume_mL;
		if (fill < 99) {
		System.out.printf("====== Cup(%3dmL - %2d)======\n", volume_mL, fill);
		Drink.printInfo();
		System.out.println("============================");}
		else {
			System.out.println("Wrong content volume!");
		}
	}
	// child class
	static class Drink {
		static String name = "Tea";
		static int volume_mL = 600;
		static void printInfo() {
			System.out.printf("- Drink: %s -\n",name);}
			
	}
}