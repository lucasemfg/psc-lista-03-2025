package ListaTres;

import java.util.Scanner;

public class NumerosComMat {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       System.out.print("Insira um número inteiro: ");
       int numUm = leitor.nextInt(); 

       System.out.print("Insira o segundo número inteiro: ");
       int numDois = leitor.nextInt(); 

       System.out.print("Insira o terceiro número inteiro: ");
       int numTres = leitor.nextInt(); 

       int maior = Math.max(numUm, Math.max(numDois, numTres));

       int menor = Math.min(numUm, Math.min(numDois, numTres));

       double media = (numUm + numDois + numTres)/3;
         
       System.out.printf("%d é o maior número\n", maior);
       System.out.printf("%d é o menor número\n", menor);
       System.out.printf("A média é %.2f", media);


       leitor.close();
    }
}
