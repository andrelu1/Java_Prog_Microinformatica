import java.util.Scanner;

public class uri1045{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
double a = in.nextDouble();
double b = in.nextDouble();
double c = in.nextDouble();

double qa = a*a;
double qbc = (b*b) + (c*c);
in.close();
if (qa > qbc) { 
  
if (qa == qbc){  
     System.out.print("TRIANGULO RETANGULO\n");
}

if (qa > qbc){
     System.out.print("TRIANGULO OBTUSANGULO\n");
} 

if(((a==b) && (a!=c)) ||((b==c) && (b!=a)) || ((c==a) && (c!=b))){
        System.out.print("TRIANGULO ISOSCELES\n");  
        }
if (qa < qbc){
   System.out.print("TRIANGULO ACUTANGULO\n");}

if(((a==b) && (a!=c)) ||((b==c) && (b!=a)) || ((c==a) && (c!=b))){
        System.out.print("TRIANGULO ISOSCELES\n");  

        }
if (qa == qbc){
         System.out.print("TRIANGULO EQUILATERO\n"); 
       }
}
if  (qa >= qbc) {
System.out.print("NAO FORMA TRIANGULO\n");}

}
}
