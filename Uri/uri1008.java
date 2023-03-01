import java.util.Scanner;

public class uri1009{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
double c = in.nextDouble();

double sa = b*c;
in.close();


System.out.println("NUMBER = " +  a);
System.out.printf("SALARY = U$ %.2f\n" , sa);

} 

}
