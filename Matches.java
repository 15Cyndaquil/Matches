import java.util.Scanner;


public class Matches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input, set;
		Scanner keyboard = new Scanner(System.in);
		
		input = keyboard.next();
		while(input.equals("exit")) {
			set = keyboard.next();
			input = set;
			System.out.println();
			if(input.matches("[^A-z]")) {
				System.out.println("You entered a Symbol or Number");
			}
			if(input.matches("[A-z]")){
				System.out.println("You entered a letter");
			}
		}	
		
		System.out.println("GoodBye");
		keyboard.close();
	}

}
