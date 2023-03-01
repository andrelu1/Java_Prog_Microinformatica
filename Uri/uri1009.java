import java.util.Scanner;

public class uri1009{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
String nome = in.next();
double sf = in.nextDouble();
double tv = in.nextDouble();

double c = tv*0.15;
double total = sf + c;
in.close();


System.out.printf("TOTAL = R$ %.2f\n" , total);

} 

}
