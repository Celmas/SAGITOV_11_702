import java.util.Scanner;
class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int x=0, sum=0;
			while (x != -1){
				x= scanner.nextInt();
				if (x%2==0) {
				sum=sum+x;
				}
			}
			System.out.println(sum);
	}
}
