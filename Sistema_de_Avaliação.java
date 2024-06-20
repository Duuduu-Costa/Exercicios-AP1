import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {

    public static void main(String[] args) {
        // Receber as notas usando JOptionPane
        String nota1Str = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        String nota2Str = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
        String trabalhoStr = JOptionPane.showInputDialog("Digite a nota do trabalho:");

        // Converter as strings recebidas para double
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double trabalho = Double.parseDouble(trabalhoStr);

        // Calcular a média
        double media = (nota1 + nota2 + trabalho) / 3;

        // Determinar se o aluno está aprovado ou reprovado
        String resultado;
        if (media >= 6) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }

        // Mostrar a média e o resultado
        String mensagem = String.format("Média: %.2f\nResultado: %s", media, resultado);
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
