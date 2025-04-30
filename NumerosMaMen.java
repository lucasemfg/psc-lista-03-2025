package ListaTres;

import java.util.Scanner;

public class NumerosMaMen {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
           System.out.print("Insira um número inteiro:");
           int valUm = leitor.nextInt();
           System.out.print("Insira um número inteiro diferente:");
           int valDois = leitor.nextInt();
           System.out.print("Insira o terceiro número inteiro:");
           int valTres = leitor.nextInt();

              if ( valUm > valDois && valDois > valTres ){
                System.out.printf("%d é o maior número\n", valUm);
                System.out.printf("%d é o menor número", valTres);
              } else if ( valDois > valTres && valTres > valUm ){
                System.out.printf("%d é o maior número\n", valDois);
                System.out.printf("%d é o menor número", valUm);
              } else if ( valTres > valDois && valDois > valUm ){
                System.out.printf("%d é o maior número\n", valTres);
                System.out.printf("%d é o menor número", valUm);
              } else if ( valUm > valDois && valTres > valDois && valUm > valTres) { 
                System.out.printf("%d é o maior número\n", valUm); 
                System.out.printf("%d é o menor número", valDois);
              } else {
                System.out.printf("%d é o maior número\n", valDois);
                System.out.printf("%d é o menor número", valTres);
              }



        leitor.close();
    }
}
