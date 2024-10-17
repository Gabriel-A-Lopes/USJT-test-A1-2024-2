package A1Noriega;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author GALop
 */
public class atv2 
{
    public static void main(String[] args) 
    {
        //aprovados e reprovados
        int aprovados = 0, reprovados = 0;
        
        //formatação da media
        DecimalFormat formatar = new DecimalFormat("0.0");
        
        //receber numero de alunos e provas realizadas
        int numAlunos = Integer.parseInt(JOptionPane.showInputDialog("Numero de alunos: "));
        int numProvas = Integer.parseInt(JOptionPane.showInputDialog("Numero de provas: "));
        
        //array de notas para os alunos e provas
        double notas[][] = new double[numAlunos][numProvas];
        
        //loop de verificação de notas por aluno
        for (int i = 0; i < numAlunos; i++)
        {
            double somaNotas = 0;
            //verificar cada prova
            for (int j = 0; j < numProvas; j++)
            {
                notas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Aluno " + (i+1) + "\n\nProva " + (j+1) + ": "));
                //guardando valor das notas dentro da segunda dimensão do array
                somaNotas += notas[i][j];
            }
            
            double media = somaNotas/numProvas;
            String mediaFormatada = formatar.format(media);
            
            //condição de aprovação
            if (media >= 70)
            {
                aprovados++;
                JOptionPane.showMessageDialog(null, "O aluno " + (i + 1) + " foi aprovado!" + "\n\nMedia final - " + mediaFormatada, "Aprovado", JOptionPane.PLAIN_MESSAGE);
            }
            else
            {
                reprovados++;
                JOptionPane.showMessageDialog(null, "O aluno " + (i+1) + " foi reprovado" + "\n\nMedia final - " + mediaFormatada, "Reprovado", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "Numero de alunos aprovados - " + aprovados + "\n\nNumero de alunos reprovados - " + reprovados);
    }
}
