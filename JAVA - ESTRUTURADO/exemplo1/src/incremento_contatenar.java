import javax.swing.JOptionPane;

public class incremento_contatenar {
  public static void main(String[] args) throws Exception 
  {
    int contador = 0 ;
      JOptionPane.showMessageDialog(null, contador, "MATEMÁTICA", JOptionPane.INFORMATION_MESSAGE);
      contador += 2;
      JOptionPane.showMessageDialog(null, contador, "MATEMÁTICA", JOptionPane.INFORMATION_MESSAGE);
      contador += 2;
      JOptionPane.showMessageDialog(null, contador, "MATEMÁTICA", JOptionPane.INFORMATION_MESSAGE);
      contador += 2;
      JOptionPane.showMessageDialog(null, contador, "MATEMÁTICA", JOptionPane.INFORMATION_MESSAGE);
      
      // numero 2 é exemplo podemos usar -=, /=, *=, %=
  }
}
