import java.util.Scanner;

class Program {
	public static void menu(){
		System.out.println("Меню");
		System.out.println("1. Создать массив");
		System.out.println("2. Добавить число в конец массива");
		System.out.println("3. Удалить число из массива");
		System.out.println("4. Вставить число в массив");
		System.out.println("5. Вывести массив");
		System.out.println("6. Выход");
	}
	public static void addNum(int array[],int x){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи число");
		int num = scanner.nextInt();
		array[x]=num;
	}
	public static void deleteNum(int array[],int k){
		Scanner scanner = new Scanner(System.in);		
		System.out.println("Введи index");
		int index = scanner.nextInt();
		array[index]=0;
		for (int i=index; i < k; i++){
			int buf=array[i];
			array[i]=array[i+1];
			array[i+1]=buf;
		}
	}
	public static void putNum(int array[],int k){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи number");
		int number = scanner.nextInt();
		System.out.println("Введи index");
		int index = scanner.nextInt();
		for( int i=k; i >= index; i--){
			array[i+1]=array[i];
		}
		array[index]=number;
	}
	public static void writeMas(int array[],int k){
		System.out.println("Массив:");
		for( int i=0;i <= k; i++){
			System.out.println(array[i]);
		}
	}
	public static int[] increaseMas(int old,int m[]){
		int b2[] = new int[2*old];
		for (int i=0; i<m.length; i++){
			b2[i]=m[i];
		}
		return b2;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,n,count;
		menu();
		a = scanner.nextInt();
		if (a!=1 && a!=6){
			System.out.println("Ты не создал массив!");
			System.out.println("Аривидерчи");
			System.exit(0);
		}
		if (a==6) System.exit(0);
		n = scanner.nextInt();
		int b[] = new int[n];
		for (int i=0; i < n; i++){
			b[i] = scanner.nextInt();
		}
		count=n-1;
		while(true){
			menu();
			a = scanner.nextInt();	
			if (a == 2){
				if (count+1==n) {
					b=increaseMas(n,b);
					n=2*n;
				}
				addNum(b,count+1);
				count++;
			}else if (a == 3){
				deleteNum(b,count);
				count--;
			}else if (a == 4){
				if (count+1==n) {
					b=increaseMas(n,b);
					n=2*n;
				}
				putNum(b,count);
				count++;					
			}else if (a == 5){
				writeMas(b,count);
			}else if (a == 6){
				System.exit(0);
			}
		}
	}
}