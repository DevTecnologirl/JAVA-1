import java.util.Scanner;
public class scanner 
{
  //imprimindo modo scaner
  public static void main(String[] args) throws Exception{
    int numero;
    Scanner leitor = new Scanner (System.in);
    System.out.println("Digite um número: ");
    numero = leitor.nextInt();

    System.out.println("Número é "+ numero);
  }
}

/*   
    float numero;
    Scanner leitor = new Scanner (System.in);
    System.out.println("Digite um número: ");
    numero = leitor.nextFloat();

    System.out.println("Número é "+ numero);
*/