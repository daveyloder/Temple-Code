package Assignment_02;

public class Singer {
	// Define string variable for all verse endings
	static String verseendings = "";

	// Function to define the verse
	public static void verse(String x) {

		System.out.print("Bought me a " + x + " and the " + x + " pleased me\r\n");
		System.out.print("I fed my " + x + " under yonder tree.\r\n");
	}

	// Function to defined the verse ending and add to global string variable
	public static void verseend(String x) {
		verseendings = x + verseendings;
		System.out.print(verseendings);
		System.out.println();
	}

	// Functions for each animal time
	public static void cat() {
		verse("cat");
		verseend("Cat goes fiddle-i-fee.\r\n");
	}

	public static void hen() {
		verse("hen");
		verseend("Hen goes chimmy-chuck, chimmy-chuck,\r\n");
	}

	public static void duck() {
		verse("duck");
		verseend("Duck goes quack, quack,\r\n");

	}

	public static void goose() {
		verse("goose");
		verseend("Goose goes hissy, hissy,\r\n");
	}

	public static void sheep() {
		verse("sheep");
		verseend("Sheep goes baa, baa,\r\n");
	}

	// Custom function, change to however you would like.
	public static void pig() {
		verse("pig");
		verseend("Pig goes oink, oink,");
	}

	// Main function to run all functions
	public static void main(String args[]) {
		cat();
		hen();
		duck();
		goose();
		sheep();
		pig();
	}
}