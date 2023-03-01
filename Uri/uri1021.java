import java.util.Scanner;


public class uri1021{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
double n = in.nextDouble();
in.close();
System.out.println("NOTAS:");
double c1 = n/100;
n=n%100;
int cc1 = (int) c1;
double c2 = n/50;
n=n%50;
int cc2 = (int) c2;
double  c3 = n/20;
n=n%20;
int cc3 = (int) c3;  
double c4 = n/10;
n=n%10;  
int cc4 = (int) c4;
double c5 = n/5;
n=n%5;
int cc5 = (int) c5;
double c6 = n/2;
n=n%2;
int cc6 = (int) c6;
double c7 = n/1;
n=n%1;
int cc7 = (int) c7;
n= n*100;
double c8 = n/50;
n = n%50;
int cc8 = (int) c8;
double c9 = n/25;
n = n%25;
int cc9 = (int) c9;
double c10 = n/10;
n = n%10;
int cc10 = (int) c10;
double c11 = n/5;
n = n%5;
int cc11 = (int) c11;
double c12 = n/1;
n = n%1;
int cc12 = (int) c12;

System.out.println(cc1+" nota(s) de R$ 100,00 ");
System.out.println(cc2+" nota(s) de R$ 50,00 ");
System.out.println(cc3+" nota(s) de R$ 20,00 ");
System.out.println(cc4+" nota(s) de R$ 10,00 ");
System.out.println(cc5+" nota(s) de R$ 5,00 ");
System.out.println(cc6+" nota(s) de R$ 2,00 ");
System.out.println("MOEDAS:");
System.out.println(cc7+" moedas(s) de R$ 1,00 ");
System.out.println(cc8+" moedas(s) de R$ 0,50 ");
System.out.println(cc9+" moedas(s) de R$ 0,25 ");
System.out.println(cc10+" moedas(s) de R$ 0,10 ");
System.out.println(cc11+" moedas(s) de R$ 0,05 ");
System.out.println(cc12+" moedas(s) de R$ 0,01 ");
} 

}
