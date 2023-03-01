import java.util.Scanner;

public class uri1012{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();

int m = (a+b+Math.abs(a-b))/2;
int maior = (m+c+Math.abs(m-c))/2;
in.close();


System.out.println(maior+" eh o maior");
} 

}
