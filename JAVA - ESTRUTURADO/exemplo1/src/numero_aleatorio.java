import javax.swing.JOptionPane;

public class numero_aleatorio 
{
  public static void main(String[] args) throws Exception 
  {
    double dado6faces = Math.random();
    JOptionPane.showMessageDialog(null, dado6faces);
  
  /* OUTRO JEITO
        int dado6Faces = 1 + (int) (Math.random() * 6);
        JOptionPane.showinputDialog(null, dado6Faces);
  */
  
  /* OUTRO JEITO - RANDOM COMO CLASSE
      int dado6Faces = 1 * (int) (Math.random() * 6);
      
      Random gerador = new Random();
      int numero = 1 * gerador.nextInt(100);
      JOptionPane.showMessageDialog(null, numero);

      //6 é o maior numero e 1 o valor minimo
  */

  /* OUTRO JEITO  
      Random gerador = new Random();
      String facesString = JOptionPane.showInputDialog(null, "Quantas faces tem o dado?");
      int facesDado = Integer.parseInt(facesString);

      int resultado = 1 + gerador.nextInt(facesDado);
      JOptionPane.showMessageDialog(null, "Você tirou " + resultado + " no dado.");
  */
  
  } 
}
