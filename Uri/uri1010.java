import java.util.Scanner;

public class uri1010{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
double r  = in.nextDouble();
double pi = 3.14159;

double vo = (4.0/3) * pi * Math.pow(r,3);
in.close();


System.out.printf("VOLUME = %.3f\n" , vo);

} 

}
