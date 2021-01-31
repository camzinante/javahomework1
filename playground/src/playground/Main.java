package playground;

public class Main {

	public static void main(String[] args) {
		
	
//		String package;
// ^ above line produces an error string cannot be resolved to a variable because package is a reserved word
		
//		String public;
// ^ above line produces an error string cannot be resolved to a variable because public is a reserved word
		
//		String break;
// ^ above line produces an error string cannot be resolved to a variable because break is recognized as a keyword
		
//		String name;
// ^ above line should be written more specifically because name can be recognized as a property of something in some instances so we should clarify a bit more
		
		String firstName;
		String lastName;

//		Integer void;
//	^ above line will give an error because these are reserved words in java
		
//		Integer final;
//	^ above line will give an error because these are reserved words in java
		
//		Integer class;
//	^ above line will give an error because these are reserved words in java
		
		Integer classMembers;
		Integer allClassMembers;

		
//		for ( ; ; ) {
//			System.out.println("This will run to infinity");
//		}
		
		
		if (true) {
			int number = 5;
			
			System.out.println(number);
		}
		
	
// System.out.println(number);
// ^ the above line produces an error code because this is not in the proper scope. It is outside of the curly brackets block, when it should be inside of them, otherwise it cannot recognize the variable name.

	}
	
}