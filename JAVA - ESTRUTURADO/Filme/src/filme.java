import java.util.Scanner;

import javax.swing.JOptionPane;

public class filme {        // METODO JOptionPane
 public static void main(String[] args) throws Exception {
   String filme = JOptionPane.showInputDialog(null, "Qual filme favorito do momento?", "Academia dos Devs", JOptionPane.QUESTION_MESSAGE);
      String texto = JOptionPane.showInputDialog(null, "Digite um número:");
      //converter int pra string
      int numero = Integer.parseInt(texto);
      numero = numero*10;
   System.out.println(filme);
   System.out.println(numero);
 }
}