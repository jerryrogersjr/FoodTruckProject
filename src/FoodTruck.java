import java.util.Scanner;

public class FoodTruck {
	// fields
	private String trkName = null;
	private String foodItem = null;
	private int trkId = 0;
	private int rating = 0;
	private static int nextTruckId = 0;
	
	
	// constructors
	public FoodTruck() {
		setTrkId(trkId);
	}

	public FoodTruck(String trkName, String foodItem, int trkId, int rating) {
		setTrkId(trkId);
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

	public int getTrkId() {
		return trkId;
	}

	public void setTrkId(int trkId) {
		trkId++;
		nextTruckId = trkId;
		this.trkId = nextTruckId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
		nextTruckId++;
	}

	@Override
	public String toString() {
		return String.format("FoodTruck [trkName=%s, foodItem=%s, trkId=%s, rating=%s]", 
				trkName, foodItem, trkId, rating);
	}

	public int getMenu(Scanner kb) {
		System.out.println("Choose from the following menu");
		System.out.println("*=======================================*");
		System.out.println("1 <== List all Food Trucks");
		System.out.println("3 <== Display Food Truck Average Rating");
		System.out.println("4 <== Display Highest Rated Food Truck");
		System.out.println("5 <== Quit Program");
		System.out.println("*=======================================*");
		int output = kb.nextInt();
		return output;
		
	}



	

	




	


	
	
	
	
}
