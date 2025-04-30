package ListaTres;

import java.util.Scanner;

public class CalcSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Calculadora.\n");
        System.out.print("insira o primeiro número: ");
        float num1 = leitor.nextFloat();
        System.out.print("insira a operação: ");
        char ope = leitor.next().charAt(0);
        System.out.print("Insira o segundo número da operação: ");
        float num2 = leitor.nextFloat();

        switch (ope) {
            case '+':
                float resultado = num1 + num2; 
                System.out.printf("O resultado da adição é %.2f",resultado);
                
                break;

            case '-':
                float resultado2 = num1 - num2; 
                System.out.printf("O resultado da subtração é %.2f", resultado2);

                break;

            case '*': 
                float resultado3 = num1 * num2; 
                System.out.printf("O resultado da multiplicação é %.2f", resultado3);
                break; 

            case '^': 
                float resultado4 = (float) Math.pow(num1, num2);
                System.out.printf("%.3f elevado a %.3f é igual a %.2f", num1, num2, resultado4);
                break; 

            default:
                System.out.println("Operação inválida.");
        break;
        }


        leitor.close();
    }
    
}
