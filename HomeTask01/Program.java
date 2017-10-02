import java.util.Scanner;
class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a,proizChisel=1,sumChisel=0,sumCifr=0,buffer;
			a= scanner.nextInt();
			while (a != -1){
				buffer=a;
				while(buffer != 0){
					sumCifr=sumCifr+(buffer%10);
					buffer/=10;
				}
				if (sumCifr%2==0) proizChisel=proizChisel*a;
				sumCifr=0;
				if (a%10==7) sumChisel=sumChisel +a;
				a= scanner.nextInt();
			}
			System.out.println("Proizvedenie chisel s chetnoy summoy cifir " + proizChisel);
			System.out.println("Summa chisel na 7 " + sumChisel);
	}
}
