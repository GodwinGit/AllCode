public class Cars extends MyVehicles {

	private int Seats;
	private boolean Boot = true;

	Cars(int ID, String Type, String VehicleName, int Seats, boolean Boot) {
		super(ID, Type,VehicleName);
		this.Seats = Seats;
		this.Boot = Boot;

	}

	int getSeats() {
		return Seats;
	}

	boolean getBoot() {
		return Boot;
	}

	void print() {
		super.print();
		System.out.print( ", Seats in the car = " + Seats
				+ ", Is Boot Available: " + Boot + "\n");
	}
}