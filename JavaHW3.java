
public class JavaHW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Coding Steps 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		subtractArrValues(ages);
		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 89};
		ages = newAges;
		subtractArrValues(ages);
		int avgAges = 0;
		
		for(int a : ages) {
			avgAges += a;
		}
		System.out.println("Average of Ages: " + avgAges/ages.length);
		
		//Coding Steps 2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int avgNumOfLetters = 0;
		for(String n : names) {
			avgNumOfLetters += n.length();
		}
		System.out.println("Average number of letters: " + avgNumOfLetters/names.length);
		
		//Coding Step 5
		int[] nameLengths = new int[names.length];
		
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//Coding Step 6
		int sumOfNameLengths = 0;
		for(int n : nameLengths) {
			sumOfNameLengths += n;
		}
		
		System.out.println("Sum of the Name Lengths: " + sumOfNameLengths);
		
		
	}
	
	//Coding Steps 1 
	static void subtractArrValues(int[] arr) {
		System.out.println(arr[arr.length-1] - arr[0]);
	}
	
	//Coding Step 7
	static String repeat(String word, int n) {
		String repeatedWord = "";
		int i = 0;
		while(i < n) {
			repeatedWord += word;
		}
		
		return repeatedWord;
	}
	
	//Coding Step 8
	static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	//Coding Step 9
	static boolean over100(int[] arr) {
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		
		return sum > 100;
	}
	
	//Coding Step 10
	static double doubleAvg(double[] arr) {
		double avg = 0;
		for(double d : arr) {
			avg += d;
		}
		
		return avg/arr.length;
	}
	
	//Coding Step 11
	static boolean doubleArrAvg(double[] arr1, double[] arr2) {
		double arr1Avg = 0, arr2Avg = 0;
		for(double a : arr1) {
			arr1Avg += a;
		}
		
		for(double b : arr2) {
			arr2Avg += b;
		}
		
		arr1Avg = arr1Avg/arr1.length;
		arr2Avg = arr2Avg/arr2.length;
		
		return arr1Avg > arr2Avg;
	}
	
	//Coding Step 12
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.5;
	}
	
	//Coding Step 13
	//the method returns the cubed result of number 
	//I created it because I like doing some math
	static double cubed(double num) {
		return num * num * num; 
	}

}
