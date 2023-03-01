import java.util.Scanner;

public class uri1044_B{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int x = in.nextInt();
int y = 1;
in.close();
if (x < 0){
   if (( x % x == 0) && ( y % x == 0))  {
   System.out.println("São Multiplos");
   } else {
   System.out.println("Nao sao Multiplos");
   }

} else {
System.out.println("Apresente um nunero valido");
       }   
  }
}

