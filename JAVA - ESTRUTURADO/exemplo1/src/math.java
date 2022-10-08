import javax.swing.JOptionPane;

public class math 
{
  public static void main(String[] args) throws Exception 
  {
    int numero1 = -5;
    int numero2 = 6;

    //math.abs
        int resultadoabs = Math.abs(numero1);
        JOptionPane.showMessageDialog(null, resultadoabs);
    //math.pow
        int resultadopow = (int) Math.pow(10, 2); //10^2
        JOptionPane.showMessageDialog(null, resultadopow);
    //math.sqrt
        int resultadosqrt = (int) Math.sqrt(4); 
        JOptionPane.showMessageDialog(null, resultadosqrt);
    //math.ceil
        double resultadoceil = Math.ceil(10.56);
        JOptionPane.showMessageDialog(null, resultadoceil);
    //math.floor
        double resultadoFloor = Math.floor(2.33);
        JOptionPane.showMessageDialog(null, resultadoFloor);
    //math.min
        double resultadomin = Math.min(numero1,numero2);
        JOptionPane.showMessageDialog(null, resultadomin);
    //math.max
        double resultadomax = Math.max(numero1, numero2);
        JOptionPane.showMessageDialog(null, resultadomax);
  }
}
