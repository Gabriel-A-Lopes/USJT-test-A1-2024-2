package A1Noriega;

import javax.swing.JOptionPane;

/**
 *
 * @author GALop
 */
public class atv1 
{
    public static void main(String[] args) 
    {
        //receber valor N
        int tamArr = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de elementos"));
        //declaração de contador de elementos
        int contador = 0;
        System.out.println("0 ");
        //casa na qual o número está
        for (int i = 0; i <= tamArr; i++)
        {
            //quantas vezes printar o numero
            for (int j = 0; j < i; j++)
            {
                   System.out.println(i + " ");
                   contador++;
            }
        }
        //display final
        JOptionPane.showMessageDialog(null, "Elementos totais: " + (contador + 1));
    }
}
