import javax.swing.JOptionPane;


public class AppRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void checkGoldisLimits (int goldisWeight, int porridgeTemp){
		String input = JOptionPane.showInputDialog(null, "What is Goldi's Weight?");
		int weight = Integer.parseInt(input);
		weight = goldisWeight;
		
		String input2 = JOptionPane.showInputDialog(null, "How hot can Goldi eat (Degrees)?");
		int temp = Integer.parseInt(input2);
		temp = porridgeTemp;
		int chairCapacity =80;
		int goldisTemp = 40;
		if(goldisWeight <chairCapacity )&& (goldisTemp <porridgeTemp){
			
		}

	}
 
	  
 
	
}
