import java.util.Scanner;

public class Prime_Finder {
	public static void main(String[] args) {
		////////////
		//Initiate//
		////////////
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Primes up starting at: ");
		int START = scanner.nextInt();
		
		System.out.print("\nGoing up to: ");
		int END = scanner.nextInt();
		
		int[] list = new int[END+1];
		for (int aa = 0; aa <= END; aa++)
			list[aa] = 0;
		
		///////////
		//Execute//
		///////////
		for (int ac = 2; ac < Math.sqrt(END); ac++) {
			if (list[ac] == 0) {
				for (int ad = START; ad <= END; ad++) {
					if ((ad%ac == 0) && (ad > ac)) {
						list[ad] = 1;
					}
				}
			}
		}
		
		///////////
		//Display//
		///////////
		int primes = 0;
		float total = END - START;
		float density;
		
		for (int ab = START; ab <= END; ab++) {
			if (ab > -1) {
				if ((list[ab] == 0) && (ab > 1)) {
					System.out.println(ab);
					++primes;
				}
			}
		}
		density = Math.round(10000 * primes/total)/100.0f;
		System.out.println("Total primes: " + primes);
		System.out.println("Density: " + density + "%");
	}
}