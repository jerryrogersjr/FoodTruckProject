import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//FoodTruck trk = new FoodTruck();
		FoodTruck[] names = new FoodTruck[5];

		System.out.print("Enter up to 5 Food Truck names.\n");
		for (int i = 0; i < names.length; i++) {
			names[i] = new FoodTruck();
			System.out.print((names.length - i) + " More Truck(s): ");
			String trk = kb.nextLine();

			String q = "quit";
			if (q.equalsIgnoreCase("quit")) {
				FoodTruck[] quitArray = new FoodTruck[i];
				for (int ii = 0; ii < quitArray.length; ii++) {
					quitArray[ii] = names[ii];
				}

			}
//			else {
//				names[i].setTrkName();

//			for (int i = 0; i < names.length; i++) {
//				
//				names[i] = new FoodTruck();
//				//FoodTruck num = names[i];
//				System.out.print("Next Truck: ");
//				
		}

	}

}
