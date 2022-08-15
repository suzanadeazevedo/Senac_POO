import java.util.Scanner;
import javax.swing.JOptionPane;
public class Faculdade {
    public static void main(String[] args) {
        float nota;
        int freq;
        String st;

        Scanner ler = new Scanner (System.in);

        System.out.println("Insira a nota de início");
        nota = ler.nextFloat();
        System.out.println("Insira a frequência de início");

        freq = ler.nextInt();
        System.out.println("Insira o status de início");

        st = ler.next();

        Boletim B1 = new Boletim(nota, freq, st);
        Boletim B2 = new Boletim();
        Boletim B3 = new Boletim("Aprovado");

        System.out.println("Uso do construtor com 3 parametros: ");
        B1.imprimir();
        System.out.println("Uso do construtor com nenhum parametro: ");
        B2.imprimir();
        System.out.println("Uso do construtor com dois parametros: ");
        B3.imprimir();
    }
}

//JOptionPane mostrar mensagem
/*Boletim B1 = new Boletim();
        Boletim B2 = new Boletim();

        double m_grad = B1.calcular_media(9.5, 4.7,6.9);
        double m_pos = B2.calcular_media(7.4, 9.2);

        JOptionPane.showMessageDialog(null, "A media do aluno de graduação é " + m_grad + "\nA média do aluno de pós graduação é " + m_pos, "BOLETIM", JOptionPane.PLAIN_MESSAGE);*/