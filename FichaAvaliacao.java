import javax.swing.*;
import java.awt.*;

public class FichaAvaliacao extends JFrame {
    public FichaAvaliacao() {
        setTitle("Ficha de Avaliação");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        JMenuBar menuBar = new JMenuBar();
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenu menuEditar = new JMenu("Editar");

        JMenuItem itemEnviar = new JMenu("Enviar");
        itemEnviar.add(new JMenuItem("email"));
        itemEnviar.add(new JMenuItem("impressora"));

        menuArquivo.add(itemEnviar);
        menuArquivo.add(new JMenuItem("Salvar"));
        menuArquivo.add(new JMenuItem("Sair"));

        menuBar.add(menuArquivo);
        menuBar.add(menuEditar);
        setJMenuBar(menuBar);

        
        JPanel painelPrincipal = new JPanel(new BorderLayout());

        
        JPanel painelTopo = new JPanel(new GridLayout(3, 2, 5, 5));
        painelTopo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        painelTopo.add(new JLabel("Código:"));
        painelTopo.add(new JTextField());

        painelTopo.add(new JLabel("Nome:"));
        painelTopo.add(new JTextField());

        painelTopo.add(new JLabel("Sexo:"));
        JPanel painelSexo = new JPanel();
        painelSexo.add(new JRadioButton("Feminino"));
        painelSexo.add(new JRadioButton("Masculino"));
        painelTopo.add(painelSexo);

        
        JPanel painelCV = new JPanel(new BorderLayout());
        painelCV.setBorder(BorderFactory.createTitledBorder("Curriculum Vitae"));
        JTextArea areaCV = new JTextArea(6, 40);
        painelCV.add(new JScrollPane(areaCV), BorderLayout.CENTER);

       
        JPanel painelAreas = new JPanel(new GridLayout(2, 2, 10, 10));
        painelAreas.setBorder(BorderFactory.createTitledBorder("Áreas"));

        painelAreas.add(new JLabel("Interesse:"));
        painelAreas.add(new JComboBox<>(new String[]{"Desenvolvedor"}));

        painelAreas.add(new JLabel("Atuação:"));
        painelAreas.add(new JComboBox<>(new String[]{"Programação"}));

        
        JPanel painelBotoes = new JPanel();
        painelBotoes.setBackground(Color.GREEN);

        String[] botoes = {"Salvar", "Anterior", "Proximo", "Novo", "Cancelar"};
        for (String texto : botoes) {
            painelBotoes.add(new JButton(texto));
        }

        
        painelPrincipal.add(painelTopo, BorderLayout.NORTH);
        painelPrincipal.add(painelCV, BorderLayout.CENTER);
        painelPrincipal.add(painelAreas, BorderLayout.SOUTH);

        getContentPane().add(painelPrincipal, BorderLayout.CENTER);
        getContentPane().add(painelBotoes, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FichaAvaliacao().setVisible(true));
    }
}
