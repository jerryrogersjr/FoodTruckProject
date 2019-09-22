import java.util.Scanner;

public class FoodTruck {
	// fields
	private String trkName;
	private String foodItem;
	private static int trkId = 3509;
	private int rating;
	private static int nextTruckId;

	// constructors
	public FoodTruck() {
		super();
	}

	public FoodTruck(String trkName, String foodItem, int trkId, int rating) {
		super();
		this.trkName = trkName;
		this.foodItem = foodItem;
		this.trkId = trkId;
		this.rating = rating;
	}

	public String getTrkName() {
		return trkName;
	}

	public void setTrkName(String trkName) {
		this.trkName = trkName;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public static int getTrkId() {
		return trkId;
	}

	public static void setTrkId(int trkId) {
		trkId++; // added
		FoodTruck.trkId = trkId;
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getToString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food Truck Name: ");
		builder.append(trkName);
		builder.append("\tFood Type: ");
		builder.append(foodItem);
		builder.append("\tTruck ID: ");
		builder.append(trkId);
		builder.append("\tRating: ");
		builder.append(rating);
		return builder.toString();
	}
//	public int truckRating(int rating) {
//		
//			switch (this.rating) {
//			case 1:
//				rating = 1;
//				break;
//			case 2:
//				rating = 2;
//				break;
//			case 3:
//				rating = 3;
//				break;
//			case 4:
//				rating = 4;
//				break;
//			case 5:
//				rating = 5;
//				break;
//			default:
//				System.err.print("Entry ERROR");
//			}
//			return rating;
//		}

	public void getMenu(Scanner kb) {
		while (true) {
			System.out.println("Choose from the following menu");
			System.out.println("*=======================================*");
			System.out.println("1 <== List all Food Trucks              |");
			System.out.println("2 <== Display Food Truck Average Rating |");
			System.out.println("3 <== Display Highest Rated Food Truck  |");
			System.out.println("4 <== Quit Program                      |");
			System.out.println("*=======================================*");
			int selection = kb.nextInt();

			if (selection == 1) {
				// food truck list
				
				displayTrucks();
			}
			if (selection == 2) {
				// food truck average
				calculateAverage();
			}
			if (selection == 3) {
				// highest rated
				// displayHighRating();
			}
			if (selection == 4) {
				System.out.println("Goodbye!");
				System.exit(0);
			}

		}

	}

	private void displayTrucks() {
		// TODO Auto-generated method stub
		System.out.println(getToString());
		
	}

	private void displayHighRating(Scanner kb) {
		// TODO Auto-generated method stub
		System.out.println("highest rated");
//		int highRating = 0;
//		for ()
	}

	private void calculateAverage() {
		// TODO Auto-generated method stub
		System.out.println("average");

	}

	public void readySetGo(Scanner kb) {

		FoodTruck[] ftArr = new FoodTruck[5];

		System.out.print("Enter up to 5 Food Truck names, food type, and rating.\n");
		FoodTruck ft = new FoodTruck();
		for (int i = 0; i < 5; i++) {
			int position = i;
			System.out.print((position + 1) + " Truck Name: ");
			String name = kb.next();
			if (name.equalsIgnoreCase("Quit")) {
				System.out.println();
				break;
			} else {
				ft.setTrkName(trkName);
				ft.setTrkId(trkId);
				System.out.print((position + 1) + " Food Type: ");
				String type = kb.next();
				ft.setFoodItem(type);
				System.out.print((position + 1) + " Rating 1 to 5: ");
				int rating = kb.nextInt();
				ft.setRating(rating);
				System.out.println();
				ftArr[i] = ft;
			}
		}
		ft.getMenu(kb);
	}

}
