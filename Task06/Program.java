import java.util.Scanner;

class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int n= scanner.nextInt();
			int a[] = new int[n];
			for (int i=0; i<n;i++){
					a[i] = scanner.nextInt();
			}
			int min,buffer=0;
			for (int i=0; i<n; i++){
				min=a[i];
				for (int j=i; j<n; j++){
					if (a[j]<=min){
						min=a[j];
						buffer=j;
					}
				}
				a[buffer]=a[i];
				a[i]=min;
			}
			System.out.println("");
			for (int i=0; i<n;i++){
					System.out.println(a[i] + " ");
			}
		}
}