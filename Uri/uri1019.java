import java.util.Scanner;

public class uri1019{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int t = in.nextInt();

int s = t % 60;
    t /= 60;
int m = t % 60;
    t /= 60;
  int h = t % 24;

System.out.println(h+":"+m+":"+s);
} 

}
