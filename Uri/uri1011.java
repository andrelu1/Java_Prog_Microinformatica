import java.util.Scanner;

public class uri1011{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
double a  = in.nextDouble();
double b = in.nextDouble(); 
double c = in.nextDouble();
double pi = 3.14159;

double tria = (a * c)/2;
double cir = pi * Math.pow(c,2);
double trap = ((a+b)*c)/2;
double quad = Math.pow(b,2);
double ret = a*b;
in.close();


System.out.printf("TRIANGULO: %.3f\n" , tria);
System.out.printf("CIRCULO: %.3f\n" , cir);
System.out.printf("TRAPEZIO: %.3f\n" , trap);
System.out.printf("QUADRADO: %.3f\n" , quad);
System.out.printf("RETANGULO: %.3f\n" , ret);
} 

}
