import java.util.Scanner;

public class FoodTruckApp {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruck trk = new FoodTruck();

		System.out.print("Enter up to 5 Food Truck names, food type, and rating.\n");
		String trk1 = "";
		FoodTruck[] ft = new FoodTruck[5];
		for (int i = 0; i < ft.length; i++) {
			ft[i] = new FoodTruck();

			if (trk1.equalsIgnoreCase("Quit")) {
				System.out.println();
				break;
			} else {
				System.out.print((ft.length - i) + " Truck Name: ");
				trk1 = kb.next();
				ft[i].setTrkName(trk1);
				ft[i].setTrkId(i);
			}
			if (trk1.equalsIgnoreCase("Quit")) {
				System.out.println();
				break;
			} else {
				System.out.print((ft.length - i) + " Food Type: ");
				String type = kb.next();
				ft[i].setFoodItem(type);
			}
			if (trk1.equalsIgnoreCase("Quit")) {
				System.out.println();
				break;
			} else {
				System.out.print((ft.length - i) + " Rating 1 to 5: ");
				int rating = kb.nextInt();
				ft[i].setRating(rating);
				System.out.println();

			}
		}
		trk.getMenu(kb);
	}
}
