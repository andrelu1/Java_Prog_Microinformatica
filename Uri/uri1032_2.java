import java.util.Scanner;

public class uri1032_2{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();
int d = in.nextInt();
in.close();
if ((b > c) & (d > a) & ((c+d) > (a+b)) & (c > 0) & (d > 0) &  
(a%2==0))  {
System.out.println("Valores aceitos");
} else {
System.out.println("Valores nao aceitos");}
} 

}
