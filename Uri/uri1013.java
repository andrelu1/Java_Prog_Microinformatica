import java.util.Scanner;

public class uri1013{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int a = in.nextInt();
double b = in.nextDouble();

double total = a /  b;
in.close();


System.out.printf("%.3f km/l\n",total);
} 

}
