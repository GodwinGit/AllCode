
public class Vans extends MyVehicles {
	private boolean RoofRack = true;

	Vans(int ID, String Type, String VehicleName, boolean RoofRack) {
		super(ID, Type, VehicleName);
		this.RoofRack = RoofRack;

	}

	boolean getRoofRack() {
		return RoofRack;
	}

	void print()
{
	super.print();
	System.out.print( " This Van comes with a Roof Rack: " + RoofRack + "\n");
	}
}


