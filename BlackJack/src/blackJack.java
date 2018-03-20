
public class blackJack {
	
	public static void main(String[] args){
		BlackJack(5,20);
	}
	 public static int BlackJack(int play1,int play2) {
		boolean play1IsLive=(play1 <=21 && play1 >0);
		boolean play2IsLive=(play2 <=21 && play2 >0);
		if (play1IsLive && play1 >play2 ){
			return play1;
			//System.out.println(play1);
			}
		else if (play2IsLive && play2 >play1 ){
			//System.out.println(play2);
			return play2;
		}
		else if (play2 >21  ){
			//System.out.println(play1);
			return play1;
		}
		else if (!play1IsLive && !play2IsLive){
			//System.out.println("0");
			return 0;
		}
		else if (play1IsLive && play2IsLive && play1 == play2){
			//System.out.println(play1);
			return play1;
		}
		else {
			//System.out.println("0");
			return 0;
		}
			}

}
