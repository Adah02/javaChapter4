import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args){

	Scanner imma = new Scanner(System.in);

	System.out.print("Enter an integer: ");
	int n = imma.nextInt();

	int i = 1;

	while (i <= n){
	n *= i;
	i++;
	}
/*	for (int i = 1; i <= n; ++i){
	multiple *= i;
	System.out.println(i);
	}  */

	System.out.printf("The factorial of %d is %d%n", n, i);
	}
}