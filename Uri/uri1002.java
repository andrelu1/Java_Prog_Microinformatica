import java.util.Scanner;

public class uri1002{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
double raio = in.nextDouble();
float n = 3.14159f; 

double a = n * Math.pow(raio,2);
in.close(); 

System.out.printf("A=%4f\n", a);


  }
}

