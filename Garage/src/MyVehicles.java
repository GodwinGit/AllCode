
public class MyVehicles {
	
	private int ID;
	private String Type;
	private String VehicleName;
	
  MyVehicles (int ID , String Type,String VehicleName){
	this.ID = ID;
	this.Type = Type;
	this.VehicleName = VehicleName;
  }
  
  int getID()
  {
	  return ID;
  }

  String getType() {
	  return Type;
  }
  String getVehicleName() {
	  return VehicleName;
  }
  void print()
  {
	  System.out.print("ID = "  + ID + ",  Type= " + Type + ",  Vehicle Name is: " + VehicleName);
  }
  }


	


