public class Garage {

	public static void main(String[] args) {
		Cars mustang = new Cars(5, "Car", " Ford Mustang", 4, true);
		// mustang.print();
		Helicopters Boeing = new Helicopters(20, "Helicopter", "Boeing Air", true);
		// Boeing.print();
		Vans Van1 = new Vans(25, "Van", "Merc Vito", true);
		Vans Van2 = new Vans(6, "Van", "Ford Vito", true);
		// Van1.print();

		MyVehicles VehicleArray[] = { mustang, Boeing, Van1, Van2 };

		for (int i = 0; i < VehicleArray.length; i++) {
			System.out.println(VehicleArray[i].getType() + " : "
					+ (VehicleArray[i].getVehicleName()));

			// System.out.println(VehicleArray[i].getClass().getCanonicalName());
			if (VehicleArray[i].getType() == "Car") {
				System.out.println("The Bill for this Vehicle is: £10");

			} else if (VehicleArray[i].getType() == "Helicopter") {
				System.out.println("The Bill for this Vehicle is £20");

			} else if (VehicleArray[i].getType() == "Van") {
				System.out.println("The Bill for this Vehicle is £30");

			}
			else 
			System.out.println("Garage cannot hold your car");

		}
	}
}
