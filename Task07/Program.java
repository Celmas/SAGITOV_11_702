import java.util.Scanner;

class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int n= scanner.nextInt();
			int a[] = new int[n];
			for (int i=0; i<n;i++){
					a[i] = scanner.nextInt();
			}
			int buffer=0;
			for (int i=n; i>0; i--){
				for (int j=0; j<i-1; j++){
					if (a[j]>a[j+1]){
						buffer=a[j];
						a[j]=a[j+1];
						a[j+1]=buffer;
					}
				}
			}
			System.out.println("");
			for (int i=0; i<n;i++){
					System.out.println(a[i] + " ");
			}
		}
}