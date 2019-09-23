import java.util.Scanner;

public class FoodTruck {
	// fields
	private String trkName;
	private String foodItem;
	private int trkId = 3508;
	private int rating;
	private static int nextTruckId = 3509;
	private int counter;

	// constructors
	public FoodTruck() {
		super();
	}

	public FoodTruck(String trkName, String foodItem, int trkId, int rating) {
		super();
		this.trkName = trkName;
		this.foodItem = foodItem;
		this.trkId = nextTruckId;
		this.rating = rating;
	}

	public int getTrkId() {
		return trkId;
	}

	public void setTrkId(int trkId) {
		this.trkId = nextTruckId;
		nextTruckId++; // added
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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	private void getMenu(Scanner kb, FoodTruck[] ftArr) {
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
				displayTrucks(ftArr); // list of all trucks and data
			}

			if (selection == 2) {
				averageRating(ftArr); // food truck rating average
			}
			if (selection == 3) {
				highestRating(ftArr); // highest rated truck
			}
			if (selection == 4) {
				System.out.println("Goodbye!");
				System.exit(0);
			}

		}

	}

	public void displayTrucks(FoodTruck[] ftArr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ftArr.length; i++) {
			if (ftArr[i] == null) {
				continue;
			} else {
				System.out.println(ftArr[i].toString());
			}
		}
	}

	public void averageRating(FoodTruck[] ftArr) {
		int output = 0;
		double average = 0;
		for (int i = 0; i < counter; i++) {
			if (i < counter) {
				output = output + ftArr[i].rating;
				average = ((double) output / counter);
			}
		}
		System.out.println("Food Truck Average: " + average);
		System.out.println();
	}

	public void highestRating(FoodTruck[] ftArr) {
		FoodTruck maxTruck = ftArr[0];
		for (int i = 0; i < counter; i++) {
			if (maxTruck.rating < ftArr[i].rating) {
				maxTruck = ftArr[i];
			}
		}
		System.out.println(maxTruck);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food Truck Name: ");
		builder.append(trkName + "\n");
		builder.append("Food Type: ");
		builder.append(foodItem + "\n");
		builder.append("Truck ID ");
		builder.append(trkId + "\n");
		builder.append("Rating ");
		builder.append(rating + "\n");
		builder.append("\n");
		return builder.toString();
	}

	public void readySetGo(Scanner kb) {

		FoodTruck[] ftArr = new FoodTruck[5];
		System.out.print("Enter up to 5 Food Truck names, food type, and rating.\n");
		for (int i = 0; i < ftArr.length; i++) {
			FoodTruck ft = new FoodTruck();
			int position = i;
			System.out.print((position + 1) + " Truck Name: ");
			String name = kb.next();

			if (name.equalsIgnoreCase("Quit")) {
				System.out.println();
				break;

			} else {
				ft.setTrkName(name);
				//ft.setTrkId(trkId);
				System.out.print((position + 1) + " Food Type: ");
				String type = kb.next();
				ft.setFoodItem(type);
				System.out.print((position + 1) + " Rating 1 to 5: ");
				int rating = kb.nextInt();
				ft.setRating(rating);
				System.out.println();
				ftArr[i] = ft;
				ftArr[i].setTrkId(i);
				counter++;
			}
		}
		getMenu(kb, ftArr);
	}
}
