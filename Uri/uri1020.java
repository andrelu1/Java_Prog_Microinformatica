import java.util.Scanner;

public class uri1035{

public static void main(String[] args) {

int n = in.nextInt();

int a = n / 365;
int m = n % 365 / 30;
int d = n % 365 % 30;
in.close();
System.out.println(a+" ano(s)");
System.out.println(m+" mes(es)");
System.out.println(d+" dia(s)");
} 

}
