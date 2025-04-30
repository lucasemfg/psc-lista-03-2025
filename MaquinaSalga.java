package ListaTres;

import java.util.Scanner;

public class MaquinaSalga {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        System.out.print("Qual o valor da compra? ");
        double valComp = leitor.nextDouble(); 

        System.out.print("Qual foi o valor pago? ");
        double valPag = leitor.nextDouble();

          if ( valComp > valPag) {
            System.out.println("Valor pago insuficiente para realizr a compra");
          } else {
            double exb = valPag - valComp;
            int troco = (int) (valPag - valComp); 
            int n50 = troco/50;
            troco = troco % 50;

            int n20 = troco/20; 
            troco = troco % 20; 

            int n10 = troco/10;
            troco = troco % 10;

            int n5 = troco/5;
            troco = troco % 5;

            int n2 = troco/2;
            troco = troco % 2; 

            int n1 = troco/1; 
            troco = troco % 1;


            System.out.printf("\nTroco: %.2f\n", exb);
            System.out.printf("Notas de R$ 50,00: %d\n",n50 );
            System.out.printf("Notas de R$ 20,00: %d\n", n20);
            System.out.printf("Notas de R$ 10,00: %d\n", n10);
            System.out.printf("Notas de R$ 5,00: %d\n", n5);
            System.out.printf("Notas de R$ 2,00: %d\n", n2);
            System.out.printf("Notas de R$ 1,00: %d\n", n1);

          }

        leitor.close();
    }
    
}
