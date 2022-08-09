package ecommerce.backend.rest.util;

//Java program to count frequencies of
//characters in string using Hashmap
import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.lang.reflect.Constructor;

import java.io.FileNotFoundException;
import java.io.File;

class UtilForCodeChallenges {

	public void declareCollections() {

		int arr[] = new int[] { 1, 2, 3, 4 };

		Vector<Integer> v = new Vector<Integer>();

		Hashtable<Integer, String> h = new Hashtable<Integer, String>();

		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		hashMap.put(Character.valueOf('c'), 1);

		String str = new String("Hola");

		char[] charArray = str.toCharArray();

		// for ( String a : charArray) {

		// }

		List<String> list = new ArrayList<>();

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Hashtable<Integer, Integer> hashTable = new Hashtable<>();

		for (Map.Entry entry : hashMap.entrySet()) {

		}

		for (String str2 : list) {

			System.out.println(str2);

		}

		String str3 = "faddasdasdasdasdasd";

		char a = str.charAt(4);

		String str4 = str3.substring(1, 2);

		Set<Integer> set = new TreeSet<>();

		set.add(1);
		set.add(1);

	}

	public void challenge() {

		/*
		 * You are given an array of numbers, display the indexes where there are
		 * consequent zeros. Ex.: [1, 6, 4, 3, 2, 0, 0, 5, 0, 7, 9, 0, 0, 0] => The
		 * consequent zeros are on array indexes 5 and 6. Index 8 is not shown since it
		 * does not have consequent zero Result: => 5, 6 => 11, 12, 13
		 * 
		 * 
		 * TECHNICAL QUESTIONS
			If you are reported that the application has a bug, how can you determine if it is true?
			
			What is your strategy for understanding, debugging, etc. the code base of a certain app, considering that eBay has a lot of code bases for different applications?
			
			Could you mention the main idea of dependency injection?
			
			How do you define in Spring framework that class A should be contained in class B via dependency injection?
			
			In Spring boot, what is the difference between autowire injection and constructor injection?
			
			Explain the CI/CD process?
			
			Let’s suppose that our CI/CD is based on Jenkins,
			what are the steps you will take to check if there is a problem with this tool?
			
			Explain what REST APIs are

			CODING CHALLENGE

			You are given an array of numbers, display the indexes where there are consequent zeros.
			Ex.:
			[1, 6, 4, 3, 2, 0, 0, 5, 0, 7, 9, 0, 0, 0] => The consequent zeros are on array indexes 5 and 6. Index 8 is not shown since it does not have consequent zero
			Result:
			=> 5, 6
			=> 11, 12, 13
			
			Given an array, put all zeros you find to the right side of the array:
			Ex.:
				[1, 0, 0, 3, 2]
			Result:
			[ 1, 3, 2, 0, 0]
			
			3.	Find the smallest item inside a number array.

		 * 
		 */

		List<Integer> list = new ArrayList<Integer>();

		int[] Array = { 1, 6, 4, 3, 2, 0, 0, 5, 0, 7, 9, 0, 0, 0 };

		int j = 0;
		int k = 0;


		for (int i = 0; i <= Array.length - 1; i++) {

			if (i + 1 <= Array.length - 1 && i - 1 >= 0) {

				if ((Array[i] == 0 && Array[i + 1] == 0) ) {
					k = i + 1;
					System.out.println("Position of Consequent Zeros:" + i);
				}else if( Array[i] == 0 && Array[i - 1] == 0 ) {
					System.out.println("Position of Consequent Zeros:" + i);	
				}

			} else if (i-1 >= 0) {
				if( Array[i] == 0 && Array[i - 1] == 0 ){
					System.out.println("Position of Consequent Zeros:" + i);
				}
			}

		}

	}

	public void usingStack(String args[]) {
		
		Stack<String> stack = new Stack<String>();
		
		Vector<String> vector = new Stack<String>();
		
		List<Integer> list = new LinkedList<Integer>();
		
		
		
		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");
		stack.push("Geeks");

		// Iterator for the stack
		Iterator<String> itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		stack.pop();

		// Iterator for the stack
		itr = stack.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public void characterCount(String inputString) {
		// Creating a HashMap containing char
		// as a key and occurrences as a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string to char array

		char[] strArray = inputString.toCharArray();

		// checking each char of strArray
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {

				// If char is present in charCountMap,
				// incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {

				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}

		// Printing the charCountMap
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	
	public void practiceFuncionalInterfacesJava8() {
		
		/*
		//Supplier
		final String x="Hola";
		Supplier<String> supplierStr = () -> x.toUpperCase();
		System.out.println(supplierStr.get());
		
		//Consumer
		Consumer<String> consumerStr = y -> System.out.println(y);
		consumerStr.accept("Hola");
		
		//Predicates
		List<Integer> listInt = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> collect = listInt.stream().filter((z) -> z >=5 ).collect(Collectors.toList());
		System.out.println(collect);
		
		*/
		
		UnaryOperator<Integer> unaryOperator = x -> x * 2;
		System.out.println(unaryOperator.apply(2));
		
		
		
	}
	

	public void numbersCount(String inputString) {

		HashMap<Character, Integer> numberCountMap = new HashMap();

		char[] strArray = inputString.toCharArray();

		for (char c : strArray) {

			int number = 0;

			if (Character.isDigit(c)) {

				if (numberCountMap.containsKey(c)) {
					numberCountMap.put(c, numberCountMap.get(c) + 1);
				} else {
					numberCountMap.put(c, 1);
				}

			}
		}

		for (Map.Entry entry : numberCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	public void camel_toSnake() {

		String s = "snake_case_to_camel_case_aja_si";
		String snake = "";
		int len = s.length();

		// List<String> list = new ArrayList<String>();

		int i = 0;
		while (i < len) {

			if (i == 0) {
				char temp = Character.toUpperCase(s.charAt(i));
				snake = snake + temp;
				// list.add(Character.toString(s.charAt(i)));
			} else if (s.substring(i, i + 1).compareTo("_") == 0) {
				char temp = Character.toUpperCase(s.charAt(i + 1));
				snake = snake + temp;
				// list.add(Character.toString(temp));
			} else if (i > 0 && s.substring(i - 1, i).compareTo("_") == 0) {

			} else {
				snake = snake + s.substring(i, i + 1);
				// list.add(s.substring(i,i+1));
			}

			i = i + 1;

		}

		System.out.println(snake);

		/*
		 * for (String str : list) { System.out.println(str);
		 * 
		 * }
		 */

	}

	public void FizzBuzzAlgorithm(int n) {

		List<String> list = new ArrayList<String>();

	}

	public void fetchArrayOfInt(int[] arrayInt) {

		for (int i : arrayInt) {
			System.out.println(i);

		}

	}

	public void declareHashMapAndPrint() {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		hashMap.put("a", 0);
		hashMap.put("c", 0);

		int i = 1;
		hashMap.put("a", i++);

		if (hashMap.containsKey("c")) {
			hashMap.put("c", hashMap.get("c") + 1);
		} else {
			hashMap.put("c", 0);
		}

		for (Map.Entry entry : hashMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

	public static double average(int a, int b) {
		return a + b / 2;
	}

	public void UsingReflectionToDestroySingletonPattern() {

		/*
		 * EagerInitialization no existe pero se quiere ver el uso del API Reflection
		 * con el Singleton Pattern
		 * 
		 * EagerInitializedSingleton instanceOne =
		 * EagerInitializedSingleton.getInstance(); EagerInitializedSingleton
		 * instanceTwo = null; try { Constructor[] constructors =
		 * EagerInitializedSingleton.class.getDeclaredConstructors(); for (Constructor
		 * constructor : constructors) { //Below code will destroy the singleton pattern
		 * constructor.setAccessible(true); instanceTwo = (EagerInitializedSingleton)
		 * constructor.newInstance(); break; } } catch (Exception e) {
		 * e.printStackTrace(); } System.out.println(instanceOne.hashCode());
		 * System.out.println(instanceTwo.hashCode());
		 * 
		 */

	}

	public void readExcelIPS() throws FileNotFoundException {

		Scanner scan = new Scanner(
				new File("D:\\Jorge\\ICE\\Gaby\\TrabajoAnálisisDeVulnerabilidad\\ReporteRangoIPSFirewall.csv"));

		String line = "";

		SortedMap<Long, String> sortedMap = new TreeMap<Long, String>();

		while (scan.hasNextLine()) {
			line = scan.nextLine();
			String array[] = line.split(",");
			String arraySinPuntos[] = new String[10];
			int i = 0;
			for (String str : array) {
				str = str.replace(" ", "");
				arraySinPuntos[i] = str.replace(".", "");
				Long intValue = new Long(arraySinPuntos[i]);
				sortedMap.put(intValue, str);
			}

		}

		sortedMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEachOrdered(e -> System.out.println(e.getValue()));

		// Set s = sortedMap.entrySet();
		// Using iterator in SortedMap
		// Iterator it = s.iterator();

		// Traversing map. Note that the traversal
		// produced sorted (by keys) output .
		/*
		 * while (it.hasNext()) { Map.Entry m = (Map.Entry)it.next();
		 * 
		 * long key = (Long)m.getKey(); String value = (String)m.getValue();
		 * System.out.println(value); }
		 */

	}

	class ComparatorExample {

		public void sortPeopleByNameAndAge() {
			List<String> people = Arrays.asList(new String("Foo"), new String("Jane"), new String("Foo"));

			Collections.sort(people);
			people.stream().sorted(Comparator.comparing(String::toString)
			// .thenComparing(String::)
			).forEach(System.out::println);
		}

	}

	public class FunctionalInterface {

		// Now we can write a method that transforms an array of short to an array
		// of byte using a rule defined by a ShortToByteFunction:

		public byte[] transformArray(short[] array, ShortToByteFunction function) {
			byte[] transformedArray = new byte[array.length];
			for (int i = 0; i < array.length; i++) {
				transformedArray[i] = function.applyAsByte(array[i]);
			}
			return transformedArray;
		}

		// Here’s how we could use it to transform an array of shorts to an array of
		// bytes multiplied by 2:

		public void transformArray2(short[] array) {

			// array = {(short) 1, (short) 2, (short) 3};
			// Return s which is the same s multiply by 2 referenced after -> and cast to
			// (byte)
			byte[] transformedArray = transformArray(array, s -> (byte) (s * 2));

			// byte[] expectedArray = {(byte) 2, (byte) 4, (byte) 6};

			// assertArrayEquals(expectedArray, transformedArray);

		}

		public void ImplementsCollections() {

			Queue<String> priorityQueue = new PriorityQueue<>();

			priorityQueue.add("Hola");

		}

	}

	public static void main(String[] args) throws FileNotFoundException {

		// String str = "Jorge3 López J5iménez2342343";

		UtilForCodeChallenges utilForCodeChallenges = new UtilForCodeChallenges();

		// utilForCodeChallenges.readExcelIPS();

		// utilForCodeChallenges.camel_toSnake();

		//utilForCodeChallenges.challenge();

		// System.out.println(UtilForCodeChallenges.average(4, 6));
		
		utilForCodeChallenges.practiceFuncionalInterfacesJava8();
		

	}

}
