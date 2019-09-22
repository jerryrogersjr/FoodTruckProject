import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// FoodTruck trk = new FoodTruck();

		System.out.print("Enter up to 5 Food Truck names, food type, and rating.\n");

		FoodTruck[] ft = new FoodTruck[5];
		String trk1 = "";
		for (int i = 0; i < ft.length; i++) {
			ft[i] = new FoodTruck();

			if (trk1.equalsIgnoreCase("Quit")) {
				break;
			} else {
				System.out.print((ft.length - i) + " Truck Name: ");
				trk1 = kb.next();
				ft[i].setTrkName(trk1);
				if (trk1.equalsIgnoreCase("Quit")) {
					break;
				} else {
					System.out.print((ft.length - i) + " Food Type: ");
					String type = kb.next();
					ft[i].setFoodItem(type);
				}
				if (trk1.equalsIgnoreCase("Quit")) {
					break;
				} else {
					System.out.print((ft.length - i) + " Rating 1 to 5: ");
					int rating = kb.nextInt();
					ft[i].setRating(rating);
					System.out.println();
				}
			}

		}

	}

}
