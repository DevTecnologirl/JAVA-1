import java.util.Scanner;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception 
    {
        String jogo;

        //criando um objeto leitor para ler valores digitados
        Scanner leitor = new Scanner(System.in);

        //configurando (definindo separadores é ; ou \r ou \n)
        leitor.useDelimiter("[;\r\n]+");

        System.out.println("Qual o seu jogo do momento?");
        jogo = leitor.next();
        System.out.println("Jogo é " + jogo);
    }
}
