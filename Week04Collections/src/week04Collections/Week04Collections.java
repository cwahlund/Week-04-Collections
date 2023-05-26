package week04Collections;

public class Week04Collections {

	public static void main(String[] args) {
		final String SEPARATOR = "-------------------";
		
		/*	1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
				a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
				b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
				c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int lastMinusFirst = ages[ages.length - 1] - ages[0];
		
		System.out.println(lastMinusFirst);
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 48};
		lastMinusFirst = ages2[ages2.length - 1] - ages[0];
		System.out.println(lastMinusFirst);
		
		int agesTotal = 0;
		double averageAge = 0;
		
		for (int i = 0; i < ages.length; i++){
			agesTotal += ages[i];
		}
		
		averageAge = ((double)agesTotal) / ages.length;
		
		System.out.println(averageAge);
		System.out.println(SEPARATOR);
		
		/*	2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
				a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
				b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		*/
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int lettersTotal = 0;
		double averageLetterCount = 0;
		
		for (String name : names) {
			lettersTotal += name.length();
		}
		
		averageLetterCount = ((double)lettersTotal / names.length);
		System.out.println(averageLetterCount);
		
		StringBuilder allNames = new StringBuilder();
		
		for (String name: names) {
			allNames.append(name + " ");
		}
		
		System.out.println(allNames.toString());
		System.out.println(SEPARATOR);
		
		// 3. How do you access the last element of any array?
		// arrayName[arrayName.length-1]
		
		// 4. How do you access the first element of any array?
		// arrayName[0]
		
		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		 */
		
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		 */
		
		int namesSum = 0;
		
		for (int name : nameLengths) {
			namesSum += name;
		}
		
		System.out.println(namesSum);
		System.out.println(SEPARATOR);
		
		/*
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */
		
		String word = "Bird";
		int numOfTimes = 3;
		
		System.out.println(concatX(word, numOfTimes));
		System.out.println(SEPARATOR);
		
		/*
		 * 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		 */
		
		System.out.println(makeFullName("Bob","Dobbs"));
		System.out.println(SEPARATOR);
		
		/*
		 * 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		 */
		
		int[] testIntArray = {42, 31, 29};
		
		System.out.println(isSumOver100(testIntArray));
		System.out.println(SEPARATOR);
		
		/*
		 * 10. Write a method that takes an array of double and returns the average of all the elements in the array.
		 */
		
		double[] testDoubleArray = {1.5, 2.0, 3.5};
		
		System.out.println(averageOfDoubles(testDoubleArray));
		System.out.println(SEPARATOR);
		
		/*
		 * 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		 */
		
		double[] secondTestDoubleArray = {2.25, 0.5, 0.75};
		
		System.out.println(isAverageOfFirstArrayGreater(testDoubleArray, secondTestDoubleArray));
		System.out.println(SEPARATOR);
		
		/*
		 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 */
		
		System.out.println(willBuyDrink(true, 11.99));
		System.out.println(SEPARATOR);
		
		/*
		 * 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 * 
		 * Method operation & purpose:
		 * The method is used to calculate the total of a purchase with a given tax rate.
		 * The cost and the tax rate are passed in and used in calculations to give the final amount.
		 */
		
		double cost = 12.50;
		double taxRate = 0.1; // yes, the sales tax in some parts of town really is 10%
		
		System.out.println(totalWithTax(cost, taxRate));
	}
	
	// Methods
	
	// 13.
	public static double totalWithTax(double cost, double taxRate) {
		double taxes = cost * taxRate;
		double grandTotal = cost + taxes;
		
		return grandTotal;
	}
	
	// 12.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.5);
	}
	
	// 11.
	public static boolean isAverageOfFirstArrayGreater(double[] firstArray, double[] secondArray) {
		double total = 0;
		double firstAvg = 0;
		double secondAvg = 0;
		
		for (double number : firstArray) {
			total += number;
		}
		
		firstAvg = total / firstArray.length;
		
		total = 0;
		
		for (double number : secondArray) {
			total += number;
		}
		
		secondAvg = total / secondArray.length;
		
		return (firstAvg > secondAvg);
	}
	
	// 10.
	public static double averageOfDoubles(double[] numbers) {
		double total = 0;
		
		for (double number : numbers) {
			total += number;
		}
		
		return (total / numbers.length);
	}
	
	// 9.
	
	public static boolean isSumOver100 (int[] ints) {
		int total = 0;
		
		for (int i : ints) {
			total += i;
		}
		
		return (total > 100);
	}
	
	// 8.
	
	public static String makeFullName(String firstName, String lastName) {
		return (firstName + " " + lastName);
	}

	// 7.
	
	public static String concatX(String word, int n) {
		StringBuilder concatStr = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			concatStr.append(word);
		}
		
		return concatStr.toString();
	}
}
