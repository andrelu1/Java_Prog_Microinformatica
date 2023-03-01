import java.util.Scanner;

public class teste3{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int nn = n;

int c1 = n / 100;

int c2 = c1%100/ 50;

int c3 = c2%50/20;

int c4 = c3%10/5;
int c5 = c4%5/2;
int c6 = c5%2/1;
int c7 = c6%1;


System.out.println(nn);
System.out.println(Math.ceil(c1));
System.out.println(Math.ceil(c2));
System.out.println(Math.ceil(c3));
System.out.println(Math.ceil(c4));
System.out.println(Math.ceil(c5));
System.out.println(Math.ceil(c6));
System.out.println(Math.ceil(c7));
} 

}
