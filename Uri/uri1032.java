import java.util.Scanner;

public class uri1032{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();
int d = in.nextInt();
int scd = c + d;
int sab = a + b;
in.close();
if ((b > c) && (d > a) && (scd > sab) && (c > 0) && (d > 0) &&  
(a%2==0))  {
System.out.println("Valores aceitos");
} else {
System.out.println("Valores não aceitos");}
} 

}
