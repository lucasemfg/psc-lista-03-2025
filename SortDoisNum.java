package ListaTres;

import java.util.Random;
import java.util.Scanner;

public class SortDoisNum {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random gerador = new Random(); 

            System.out.print("Insira um número inteiro: ");
            int num1 = leitor.nextInt(); 
            
            System.out.print("Insira outro número inteiro: ");
            int num2 = leitor.nextInt(); 

            int menor = Math.min(num1, num2);
            int maior = Math.max(num1, num2);

            int sorte = gerador.nextInt(maior - menor + 1) + menor;

              if (sorte % 2 == 0) {
                System.out.printf("O número sorteado é %d e é um número par\n",sorte );
              } else {
                System.out.printf("O número sorteado é %d e é um número ímpar\n",sorte );
              }

        leitor.close();
        }
}
