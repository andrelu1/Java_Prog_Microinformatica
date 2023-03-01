import java.util.Scanner;

public class uri1015{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
double x1 = in.nextDouble();
double y1 = in.nextDouble();
double x2 = in.nextDouble();
double y2 = in.nextDouble();

double di = Math.sqrt(Math.pow((x2-x1),2) + 
Math.pow((y2-y1),2));
in.close();


System.out.printf("%.4f\n",di);
} 

}
