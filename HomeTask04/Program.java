import java.util.Scanner;

class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a,n,count,index,buf, num, number;
			System.out.println("Меню");
			System.out.println("1. Создать массив");
			System.out.println("2. Добавить число в конец массива");
			System.out.println("3. Удалить число из массива");
			System.out.println("4. Вставить число в массив");
			System.out.println("5. Вывести массив");
			System.out.println("6. Выход");
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
				System.out.println("Меню");
				System.out.println("1. Создать массив");
				System.out.println("2. Добавить число в конец массива");
				System.out.println("3. Удалить число из массива");
				System.out.println("4. Вставить число в массив");
				System.out.println("5. Вывести массив");
				System.out.println("6. Выход");
				a = scanner.nextInt();	
				if (a == 2){
					System.out.println("Введи число");
					num = scanner.nextInt();
					b[count+1]=num;
					count++;
				}else if (a == 3){
					System.out.println("Введи index");
					index = scanner.nextInt();
					b[index]=0;
					for (int i=index; i < (n-1); i++){
						buf=b[i];
						b[i]=b[i+1];
						b[i+1]=buf;
					}
					count--;
				}else if (a == 4){
					System.out.println("Введи number");
					number = scanner.nextInt();
					System.out.println("Введи index");
					index = scanner.nextInt();
					for( int i=count; i >= index; i--){
						b[i+1]=b[i];
					}
					b[index]=number;
					count++;					
				}else if (a == 5){
					System.out.println("Массив:");
					for( int i=0;i <= count; i++){
						System.out.println(b[i]);
					}
				}else if (a == 6){
					System.exit(0);
				}
			}
		}
}