import java.util.Scanner;

public class uri1047 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int mi, hi, mf,hf;

        mi = in.nextInt();
        hi = in.nextInt();
        mf = in.nextInt();
        hf = in.nextInt();
        in.close();


        String saida = "";

        if (hi > hf && a < c) { 

            if (b < c) { // 'b' é o médio e 'c' é o maior valor

                saida = a + " - " + b + " - " + c;

            } else { // 'c' é o médio e 'b' é o maior valor

                saida = a + " - " + c + " - " + b;

                saida = a + " - " + c + " - " + b;

            }

        } else if (b < a && b < c) { // 'b' é o menor valor

            if (a < c) { // 'a' é o médio e 'c' é o maior valor

                saida = b + " - " + a + " - " + c;

            } else { // 'c' é o médio e 'a' é o maior valor

                saida = b + " - " + c + " - " + a;

            }

        } else { // 'c' é o menor valor

            if (a < b) { // 'a' é o médio e 'b' é o maior valor

                saida = c + " - " + a + " - " + b;

            } else { // 'b' é o médio e 'a' é o maior valor

                saida = c + " - " + b + " - " + a;

            }

        }
        // SAÍDA
        System.out.println(saida);
    }

}

