import java.util.Scanner;
public class scaner{
  public static void main(String[] args) throws Exception 
  {
    String jogo;
    //criar objetos para ler valores digitados
    Scanner leitor = new Scanner(System.in);
    // configurando os separadores ; e \r e \n
    leitor.useDelimiter("[;\r\n]+");

    System.out.println("Qual o seu jogo do momento?");
    
    jogo = leitor.next();

    System.out.println("Jogo é " + jogo);
  }
}
