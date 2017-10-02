import java.util.Scanner;
class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a,max,min;
			a= scanner.nextInt();
			max=a;min=a;
			while (a != -1){
				if (a>max) max=a;
				if (a<min) min=a;
				a=scanner.nextInt();
			}
			System.out.print("Raznost = ");
			System.out.println(max-min);
	}
}
