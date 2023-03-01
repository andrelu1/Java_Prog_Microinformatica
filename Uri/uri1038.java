import java.util.Scanner;

public class uri1038{

public static void main(String[] args) {

Scanner in = new Scanner(System.in);
int cod = in.nextInt();
int qtd = in.nextInt();
in.close();

if (cod == 1) {
   double total = qtd * 4f; 
System.out.printf("Total: R$ %.2f\n",total);
}
else if (cod == 2){
double total = qtd *4.5f;
System.out.printf("Total: R$ %.2f\n",total);
}
else if (cod == 3){
double total = qtd *5.0f;
System.out.printf("Total: R$ %.2f\n",total);
}
else if (cod == 4){
double total = qtd * 2.0f;
System.out.printf("Total: R$ %.2f\n", total);
}
else if (cod == 5){
double total = qtd * 1.5f;
System.out.printf("Total: R$ %.2f\n", total);
}

  else {
System.out.println("Fora do Intervalo");
}
} 

}
