package ListaTres;

import java.util.Scanner;

public class EqSegundoGr {
      public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
            System.out.print("Coeficiente a: ");
            double a = leitor.nextDouble();
            System.out.print("Informe o coeficiente b: ");
            double b = leitor.nextDouble();
            System.out.print("Informe o coeficiente c: ");
            double c = leitor.nextDouble();
        
            if (a == 0 && b == 0 && c != 0) {
                    System.out.println("Coeficientes informados incorretamente.");
            } else if (a == 0 && b != 0) {
                    System.out.println("Essa é uma equação de primeiro grau.");
                    double raiz = -c / b;
                    System.out.printf("A raiz da equação é: %.2f\n", raiz);
            } else {
                    double delta = b * b - 4 * a * c;
        
             if (delta < 0) {
                    System.out.println("Esta equação não possui raízes reais.");
            } else if (delta == 0) {
                    System.out.println("Esta equação possui duas raízes reais iguais.");
                    double raiz = -b / (2 * a);
                    System.out.printf("A raiz da equação é: %.2f\n", raiz);
            } else {
                    System.out.println("Esta equação possui duas raízes reais diferentes.");
                    double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.printf("As raízes da equação são: %.2f e %.2f\n", raiz1, raiz2);
                    }
                }
        
        leitor.close();
            
              
            }
}
