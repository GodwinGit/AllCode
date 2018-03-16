import java.util.ArrayList;

public class ArrayListBasic {

	public static void main(String[] args) {
		ArrayList<String> myFriends = new ArrayList<String>();
		myFriends.add("Chad");
		myFriends.add("Nabeel");
		myFriends.add("Abdil");
		myFriends.add("Abdi");
		myFriends.add("Ryan");
		System.out.println(myFriends);
		// myFriends.get(0)= Get index content
		System.out.println(myFriends.get(0));
		// Clears all of the elements in the myFriends Array
		myFriends.clear();
		System.out.println(myFriends);
	}

}
