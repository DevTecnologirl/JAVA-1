
import javax.swing.JOptionPane;
public class imprimir 
{
  public static void main(String[] args) throws Exception
  {
      String filme = JOptionPane.showInputDialog(null, "Qual seu filme favorito? ");
      String texto = JOptionPane.showInputDialog(null, "informe um número: ");
      int numero = Integer.parseInt(texto);
      numero = numero * 10;
      JOptionPane.showMessageDialog(null, "Compartilhe sua experiência!", "filmes 2022",JOptionPane.INFORMATION_MESSAGE);
      System.out.println(filme);
      System.out.println(numero);
  }
}
