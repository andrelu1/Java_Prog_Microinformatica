import java.util.Scanner;

public class uri1007{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();
int d = in.nextInt();

int dif = (a*b - c*d);
in.close();

System.out.println("DIFERENCA = " +  dif);

} 

}
