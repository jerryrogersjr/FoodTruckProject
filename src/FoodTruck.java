import java.util.Scanner;

public class FoodTruck {
	// fields
	private String trkName;
	private String foodItem;
	private int trkId;
	private int rating;
	private static int nextTruckId = 3509;

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
				displayTrucks(ftArr);
				for (int i = 0; i < ftArr.length; i++) {
					if ( ftArr[i] == null) {
						break;
					} else {
						System.out.println("Truck " + (i + 1) + ": " + ftArr[i]);
					}
				}
			}

			if (selection == 2) {
				// food truck average
			}
			if (selection == 3) {
				// highest rated
			}
			if (selection == 4) {
				System.out.println("Goodbye!");
				System.exit(0);
			}

		}

	}

	

	private void displayTrucks(FoodTruck[] ftArr) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ftArr.length; i++) {
			if ( ftArr[i] == null) {
				break;
			} else {
				System.out.println("Truck " + (i + 1) + ": " + ftArr[i]);
			}
		}
	}

	@Override
	public String toString() {
		return "FoodTruck [trkName=" + trkName + ", foodItem=" + foodItem + ", trkId=" + trkId + ", rating=" + rating
				+ "]";
	}

	public FoodTruck[] readySetGo(Scanner kb) {

		FoodTruck[] ftArr = new FoodTruck[5];

		System.out.print("Enter up to 5 Food Truck names, food type, and rating.\n");
		FoodTruck ft = new FoodTruck();
		for (int i = 0; i < 5; i++) {
			int position = i;
			System.out.print((position + 1) + " Truck Name: ");
			trkName = kb.next();
			if (trkName.equalsIgnoreCase("Quit")) {
				System.out.println();
				break;
			} else {
				ft.setTrkName(trkName);
				ft.setTrkId(trkId);
				System.out.print((position + 1) + " Food Type: ");
				foodItem = kb.next();
				ft.setFoodItem(foodItem);
				System.out.print((position + 1) + " Rating 1 to 5: ");
				rating = kb.nextInt();
				ft.setRating(rating);
				System.out.println();
				ftArr[i] = ft;
				System.out.println(toString());
			}
		}
		getMenu(kb, ftArr);
		return ftArr;
	}

}
