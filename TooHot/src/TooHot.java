
public class TooHot {

	public static void main(String[] args) {
	  tooHot(2,false);
	}
	public static boolean  tooHot(int temp,boolean isSum){
		
	    if (temp >=60 && temp <=90 && isSum == true){
			System.out.println(isSum);
	    	return isSum;
				
			}
	    else{ 
	    	System.out.println(!isSum);
	    	return !isSum;

}
	}
}
