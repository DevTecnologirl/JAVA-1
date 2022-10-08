import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception 
    {
        int resulsoma = 8 + 8;
        int resultsub = 8 - 8;
        int resultmult = 8 * 8;
        int resultdiv = 8 / 8;
        int resultresto = 8 % 8;



        JOptionPane.showMessageDialog(null, resulsoma, "MATEMÁTICA", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultsub, "MATEMÁTICA", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultmult, "MATEMÁTICA", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultdiv, "MATEMÁTICA", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, resultresto, "MATEMÁTICA", JOptionPane.INFORMATION_MESSAGE);
    }
}
