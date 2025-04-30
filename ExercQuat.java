package ListaTres;

import java.util.Scanner;

public class ExercQuat {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
            System.out.print("Escolha:\n1 para calcular o perímetro de um círculo. \n2 para para calcular a área de um círculo. \n3 para calcular o volume de uma esfera: ");
            int opcao = leitor.nextInt();

            double pi = 3.141592;
            double raio;
            
                switch ( opcao) { 
                    case 1:
                System.out.println("Iremos calcular o perimetro do círculo");
                System.out.println("Qual o raio do circulo?");
                raio = leitor.nextDouble(); 
                double perimetro = 2*pi*raio; 
                System.out.printf("O perímetro do circulo é: %.2f", perimetro);
                break; 

                    
                    case 2:
                System.out.println("Iremos calcular a área do circulo");
                System.out.println("Qual o raio do circulo?");
                raio = leitor.nextDouble();
                double area = pi*(raio*raio); 
                System.out.printf("A área do circulo é: %.2f", area);
                break; 
               
                    case 3:
                System.out.println("Iremos calcular o volume de uma esfera");
                System.out.println("Qual o raio da esfera?");
                raio = leitor.nextDouble();
                double volume = (4*Math.pow(raio, 3))/3;
                System.out.printf("O volume da esfera é: %.2f π ³", volume);
                break; 

                default: 
                    System.out.println("Operação inválida.");
                }

        leitor.close();
    }
    
}
