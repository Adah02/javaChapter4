import java.util.Scanner;
public class PalindromeNumbers {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number in hundred: ");
	int userInput = input.nextInt();

	int firstDigit = (userInput / 100); System.out.print(firstDigit);
	int secondDigit = (userInput % 100 / 10); System.out.print(secondDigit);
	int thirdDigit = (userInput % 10); System.out.print(thirdDigit);

	int digits = ("thirdDigit" + "secondDigit" + "firstDigit");

	if (userInput == digits) System.out.printf("%d is a palindrome", userInput);
	else{ System.out.printf("%d is not a palindrome", userInput);
		}

	}

}