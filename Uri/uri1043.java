import java.util.Scanner;

public class uri1043{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
double x = in.nextDouble();
double y = in.nextDouble();
double z = in.nextDouble();
in.close();
if ((x + y < z ) | (z > x - y)) {
   double p = x+y+z;
   System.out.printf("Perimetro : %.1f\n", p );
}else  { 
   double a = ((x+y)/2)* z;
   System.out.printf("Area : %.1f\n", a );
}

}
}
