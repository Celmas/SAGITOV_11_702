import java.util.Scanner;

class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int n= scanner.nextInt();
			int a[] = new int[n];
			for (int i=0; i<n;i++){
					a[i] = scanner.nextInt();
			}
			int max=a[0], min=a[0], iMin=0, iMax=0;
			for (int i = 0; i<n; i++){
				if (a[i]>max) {
					iMax=i;
					max=a[i];
				}
				if (a[i]<min) {
					iMin=i;
					min=a[i];
				}
			}
			System.out.println("");
			a[iMin]=max;
			a[iMax]=min;
			for (int i=0; i<n;i++){
					System.out.println(a[i] + " ");
			}
		}
}