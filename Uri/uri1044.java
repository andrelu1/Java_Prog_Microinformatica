import java.util.Scanner;

public class uri1044{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int x = in.nextInt();
int y = in.nextInt();
in.close();

if (( x % x == 0) && ( y % x == 0))  {
   System.out.println("São Multiplos");
}else {
 System.out.println("Nao sao Multiplos");
}

}
}
