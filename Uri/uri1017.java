import java.util.Scanner;

public class uri1017{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int t = in.nextInt();
int vm = in.nextInt();

double comb = (t*vm) / 12.0;
System.out.printf("%.3f\n",comb);
} 

}
