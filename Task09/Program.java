import java.util.Scanner;


class Program {
	public static void bubbleSort(int array[]){
		for (int i = array.length-1; i>=0; i--) {
			for (int j = 0; j<i; j++) {
				if (array[j] > array[j+1]) {
					int t = array[j];
					array[j] = array[j+1];
					array[j+1] = t;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		bubbleSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		n = scanner.nextInt();
		int b[] = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = scanner.nextInt();
		}
		bubbleSort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}