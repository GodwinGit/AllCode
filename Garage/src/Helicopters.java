public class Helicopters extends MyVehicles {
	private boolean CanFly = true;

	Helicopters(int ID, String Type, String VehicleName, boolean CanFly) {
		super(ID, Type, VehicleName);
		this.CanFly = CanFly;

	}

	boolean getCanFly() {
		return CanFly;
	}

	void print()
{
	super.print();
	System.out.print( " This Helicopter can fly: " + CanFly + "\n");
	}
}
