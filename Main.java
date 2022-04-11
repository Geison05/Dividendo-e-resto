import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    //Variavel
    int dividendo = 0;
    int divisor =0;
    int quociente =0;
    int resto = 0;
    //Entrada de Dados
    System.out.println("Qual Número ira Dividir Hoje ?");
    dividendo = leitor.nextInt();
    System.out.println("\n Por Qual numero ?");
    divisor = leitor.nextInt();
    //Processamento
    quociente = dividendo / divisor;
    resto = divisor * quociente - dividendo;
    //Saida
    System.out.println("\ndividendo :"+ dividendo);
    System.out.println("\nDivisor :"+ divisor);
    System.out.println("\nQuociente :"+ quociente);
    System.out.println("\nResto :"+ resto);

  }
}