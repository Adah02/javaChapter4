public class Asterisks_Pattern {

	public static void main(String[] args){

	for (int i = 1; i <= 10; i++){
	System.out.print(("*" * i) + ("*" * 11-i) + ("*" * 11-i) + ("*" * i));
	}

	}


}