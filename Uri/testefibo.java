import java.util.Scanner;

public class testefibo{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int num1 = in.nextInt();
int num2 = 0;
in.close();
for (int i = 0; i <10; i++){
 num1 = num1 + num2;
 num2 = num1 - num2;
System.out.println(num1);

}
}
}
