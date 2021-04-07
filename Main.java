import java.util.Scanner;
class Main {
  public static void main(String[] args) {
		//creating the array of seven names
    String[ ] firstNames = {"Ian", "Josh", "Cameron", "Dylan", "Trey", "Alex", "Jack"};
		//declaring scanner to recieve full name
		Scanner scan = new Scanner(System.in);
		//asking for full name
		System.out.println("What is your full name?");
		//Saving into fullName variable
		String fullName = scan.nextLine();
		int ind = fullName.indexOf(" ");
		//Setting the userFirstName variable equal to the substring of the index.
		String userFirstName = fullName.substring(0, ind);
		//Creating for loop to loop through the array in order to find a name.
	for (int i = 0; i < 7; i++){
		//Using if statement to compare to the array.
		if(userFirstName.equals( firstNames[i])){
			//printing a customized welcome statement.
			System.out.println("Welcome Back " + userFirstName + "!");
		}
  }
  }
}