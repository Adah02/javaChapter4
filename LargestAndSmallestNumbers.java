import java.util.Scanner;
public class LargestAndSmallestNumbers {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int counter = 0;
	int largest = 0;
	int smallest = 0;
	

	System.out.print("Enter numbers. type 0 to stop: ");
	int userInput = input.nextInt();

	while (userInput != -1){
	largest += userInput;
	System.out.print("Enter number: ");
	userInput = input.nextInt();
	counter += 1;
	}

	if (userInput > largest) largest = userInput;
	largest += userInput;
	System.out.printf("Largest: %d%n", largest);

	if (largest > userInput)
	System.out.printf("Largest: %d%n", largest);

}
}