import java.io.IOException;
import java.util.Scanner;

public class uri1040 {
 
    public static void main(String[] args) throws IOException {
 
Scanner in = new Scanner(System.in);
double n1 = in.nextDouble();
double n2 = in.nextDouble();
double n3 = in.nextDouble();
double n4 = in.nextDouble();

double media = ((n1*2) + (n2*3) + (n3*4) + n4)/10;
if (media >= 7) {
   System.out.println("Aluno aprovado");
}
else if ((media >= 5.0) | (media <=6.9)){
System.out.println("Aluno em exame");
double n5 = in.nextDouble();
System.out.printf("Nota do exame: %.1f\n",n5);
double media2 = (media + n5)/2;
if (media2 >= 5) {
System.out.println("Aluno aprovado.");
System.out.printf("Media final: %.1f\n",media2);
}else { 
System.out.println("Aluno reprovado");
}
}

}
}
