package weekOneJava;

public class weekOneJava {
	public static void main(String[] args){
	helloWorld();
	helloVariable("Hello World!");
	wordParameters("Hey, There");
	sumInt(2,5);
	sumIntBool(3,2,false);
	zeroNum(2,4);
	iteraton();
	arrayTime();
	arrayLoop();
	arrayX10();
	blackJack(-1,-1);
	uniqueSum(1,3,2);
	tooHot(1,true);

}

static void helloWorld(){
	System.out.println("Hello world!");
	
}
static void helloVariable(String hello){
	System.out.println(hello);
}
static void wordParameters(String word){
	System.out.println(word);
}
static void sumInt(int num1,int num2){
	int num3 = num1 + num2;
	System.out.println(num3);
}
static void sumIntBool(int num1,int num2,boolean c){
	int addIt = num1+num2;
	int multiIt = num1*num2;
	if (c == true) {
		System.out.println(addIt);
	}
		else {
			System.out.println(multiIt);}
		}
static void zeroNum(int zero1,int zero2){
	if (zero1 == 0){
		System.out.println(zero2);
	}
	else {
			System.out.println(zero1);{
				
			}
	}
	}
static void iteraton(){
	for (int i =0; i <10; i++){
		zeroNum(i,5);
	}
	
}
static void arrayTime(){
	int[] myArray = {30,23,85,78,65,30,70,44,6,10};
	zeroNum(myArray[0],myArray[1]);
}
static void arrayLoop(){
	int[] myArray = {30,23,85,78,65,30,70,44,6,10};
	for(int i : myArray ){
		   System.out.println("Array: "+i);
}
}
static void arrayX10(){
	int [] a = new int [10];
	for (int i =0; i <10; i++) {
		a [i] = i + 1;
		System.out.print(i + " , ");
	}
	{ 
		System.out.println("\n");
	}
	for (int i =0; i <10; i++) {
			//arrayX10 [i] = i + 1;
			System.out.print(i*10+ " , ");
	}
}
static void blackJack(int play1,int play2) {
	boolean play1IsLive=(play1 <=21 && play1 >0);
	boolean play2IsLive=(play2 <=21 && play2 >0);
	if (play1IsLive && play1 >play2 ){
		System.out.println(play1);
		}
	else if (play2IsLive && play2 >play1 ){
		System.out.println(play2);
	}
	else if (play2 >21  ){
		System.out.println(play1);
	}
	else if (!play1IsLive && !play2IsLive){
		System.out.println("0");
	}
	else if (play1IsLive && play2IsLive && play1 == play2){
		System.out.println(play1);
	}
	else {
		System.out.println("0");
	}
		}
static void uniqueSum(int num1,int num2,int num3){
	int a = num1;
	int b = num2;
	int c = num3;
	int sum = a+b+c;
	
	if (a == b && a == c ){
		System.out.println("0");
	}
	if (a == b || a == c ){
		System.out.println(sum-(a+a));
			
		}
	else if (b == a || b == c){
		System.out.println(sum-(b+b));
	}
	else if (c == a || c == b){
		System.out.println(sum-(c+c));
	}
	else {
		System.out.println(sum);
	}
}
static void tooHot(int temp,boolean isSum){
	
    if (temp >=60 && temp <=90 && isSum == true){
		System.out.println(isSum);
			
		}
    else{ 
    	System.out.println(!isSum);
		
	}
	}
	
}


	
			
			


		
	


		
	

	




