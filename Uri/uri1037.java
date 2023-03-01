import java.util.Scanner;

public class uri1037{

public static void main(String[] args) {
Scanner in = new Scanner(System.in);

    double ponto = in.nextDouble();

    in.close();

    
    String msg = ""; 
    if (ponto >= 0 && ponto <= 25) {
      msg = "Intervalo [0,25]";
    } else if (ponto > 25 && ponto <= 50) {
      msg = "Intervalo (25,50]";
    } else if (ponto > 50 &&ponto <= 75) {
      msg = "Intervalo (50,75]";
    } else if (ponto > 75 && ponto <= 100) {
      msg = "Intervalo (75,100]";
    } else {
      msg = "Fora de intervalo";
    }

    
    System.out.println(msg);

  }
}
