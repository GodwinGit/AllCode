package weekOneJava;

public class People {

	public int age;
	public String name;
	public String job;

	public People(String name, int age, String job) {
		this.age = age;
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return (name + age + job);
	}

	public void main(String args[]) {
		People p1 = new People("Godwin", 22, "IT Technician");
		People p2 = new People("Abdi", 22, "IT Technician");
		People p3 = new People("Julian", 28, "Chef");
		System.out.println(p1);
		
	 People peeps [] = new People [3];
	 peeps [0] = p1;
	 peeps [1] = p2;
	 peeps [2] = p3;
	 
	 for (int i =0; i <peeps.length; i++) {
		 System.out.println(peeps[i]);
	 }
		 

	}

}
