import java.util.Scanner;

public class uri1005{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
double m1 = in.nextDouble();
double m2 = in.nextDouble();
double media = ((m1*3.5f) + (m2*7.5f)) / 11;
in.close();

System.out.printf("MEDIA = %1.5f\n", media);

} 

}
