import java.util.Scanner;
class Program {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int a,i=1,sum=0,iSum=1;
			while (i!=100){
				a=scanner.nextInt();
				sum=sum+a;
				i++;
				iSum=iSum+i;
			}
			System.out.print("Chislo = ");
			System.out.println(iSum-sum);
	}
}
