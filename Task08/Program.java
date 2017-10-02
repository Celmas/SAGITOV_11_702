import java.util.Scanner;

class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int n= scanner.nextInt();
			int a[] = new int[n];
			int buffer;
			for (int i=0; i<n;i++){
					a[i] = scanner.nextInt();
			}
			int b=n;
			for (int i=0; i<n; i++){
					buffer=a[i];
					a[i]=a[n-1];
					a[n-1]=buffer;
					n--;
			}
			System.out.println("");
			for (int i=0; i<b;i++){
					System.out.println(a[i] + " ");
			}
		}
}