import javax.swing.JOptionPane;

public class operadorAritmetico
{
  public static void main(String[] args) throws Exception
  {
    int numeroA = 5;
    int numeroB = 6;
    
    int resultado = numeroA + numeroB;

    JOptionPane.showMessageDialog(null, "MATEMÁTICA", "Cálulo Matemático", JOptionPane.INFORMATION_MESSAGE);
  }
}
