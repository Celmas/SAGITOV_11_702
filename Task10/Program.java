import java.util.Scanner;


class Program {
	public static boolean isPrime(int number){
		int k=0;
		for( int i=2; i*i<=number; i++){
			if (number%i==0){
				k++;
			}
		}
		if (k==0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if (x==2 || x==3 ){
			System.out.println("Prime");
		} else if (isPrime(x)==true) {
			System.out.println("Prime");
		} else System.out.println("NonPrime");
	}
}