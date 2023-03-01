import java.util.Scanner;

public class uri1018{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(n);

int c1 = n/100;
n=n%100;
int c2 = n/50;
n=n%50;
int c3 = n/20;
n=n%20;  
int c4 = n/10;
n=n%10;  
int c5 = n/5;
n=n%5;
int c6 = n/2;
n=n%2;
int c7 = n/1;
n=n%1;
System.out.println(c1+" nota(s) de R$ 100,00");
System.out.println(c2+" nota(s) de R$ 50,00");
System.out.println(c3+" nota(s) de R$ 20,00");
System.out.println(c4+" nota(s) de R$ 10,00");
System.out.println(c5+" nota(s) de R$ 5,00");
System.out.println(c6+" nota(s) de R$ 2,00");
System.out.println(c7+" nota(s) de R$ 1,00");
} 

}
