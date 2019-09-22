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
		FoodTruck.trkId = trkId;
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
		builder.append("Food Type: ");
		builder.append(foodItem);
		builder.append("Truck ID: ");
		builder.append(trkId);
		builder.append("Rating: ");
		builder.append(rating);
		return builder.toString();
	}

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
				displayHighRating();
			}
			if (selection == 4) {
				System.out.println("Goodbye!");
				System.exit(0);
			}

		}

	}

	private void displayHighRating() {
		// TODO Auto-generated method stub
		System.out.println("highest rated");
	}

	private void displayTrucks() {
		// TODO Auto-generated method stub
		System.out.println(getToString());
	}

	private void calculateAverage() {
		// TODO Auto-generated method stub
		System.out.println("average");

	}
	
}
