import java.util.Scanner;

public class scanner {
  public static void main(String[] args) throws Exception {
    int numero; //float numero
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um \n numero:");
    //leitura com nextInt
    numero = leitor.nextInt(); // nextFloat()

    System.out.println("Número é "+ numero);
  }
}
