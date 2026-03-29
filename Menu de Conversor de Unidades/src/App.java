// Josué Luís Pimenta Alecrim
// 1261948087
// 29/03/2026
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

         double milhas, fahrenheit, libras, celsius;
        double km, kg;
        int conversor = 0;
        do {
        System.out.println("=== CONVERSOR DE UNIDADES ===\n1 - Quilômetros para Milhas\n2 - Celsius para Fahrenheit\n3 - Quilogramas para Libras\n0 - Sair");
       
        System.out.println("Escolha uma opção.");
        conversor = entrada.nextInt();

        switch (conversor) {
        
        case 1: 
        System.out.println("Digite a kilometragem");
        km = entrada.nextDouble();
        milhas = km * 0.621371;
        System.out.println();
        System.out.println("Resultado" + "=" + milhas + "milhas");
        break;

        case 2: 
        System.out.println("Digite a temperatura em Celsius:");
        celsius = entrada.nextDouble();
        fahrenheit = (celsius * 9/5) + 32; 
        System.out.println();
        System.out.println("Resultado" + "=" + fahrenheit + "fahrenheit");
        break;
        
        case 3: 
        System.out.println("Digite o peso em kg");
        kg = entrada.nextDouble();
        libras =  kg * 2.20462; 
        System.out.println();
        System.out.println("Resultado" + "=" + libras + "libras");
        break;
        
        case 0: 
        System.out.println("Encerrando, até um outro dia");
        break;

        default:
            System.out.println("opção invalida");
        }
     } while (conversor != 0);
   }
 }

    



    
