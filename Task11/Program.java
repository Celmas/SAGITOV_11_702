import java.util.Scanner;
class Program {
    public static double function(double x) {
        return Math.sin(1 / x);
    }
    public static double integrate(double a, double b, double h) {
        double sum=0;
		for(double i=a; i <= b; i+=h){
			if (i!=0){
			sum=sum+function(i)*h;
			}
		}
		return sum;
    }
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        // считать
        double a= scanner.nextDouble();;
        double b= scanner.nextDouble();
        int n= scanner.nextInt();

        // посчитать
        double h = Math.abs(a-b)/n;
        double integral = integrate(a, b, h);
		System.out.println(integral);
    }
}