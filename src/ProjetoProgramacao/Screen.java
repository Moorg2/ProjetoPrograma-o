package src.ProjetoProgramacao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Screen extends JFrame {

    private JogoDeCartas jogo; // Instância de JogoDeCartas

    public Screen(JogoDeCartas jogo) {
        this.jogo = jogo;
        setTitle("Crônicas de Arcana");
        setVisible(true);
        setSize(900, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setLayout(null);

        // Criar e configurar o botão "Iniciar"
        JButton jButton = new JButton("Iniciar");
        jButton.setBounds(325, 400, 250, 70); // Centralizando o botão
        jButton.setFont(new Font("Arial", Font.PLAIN, 30));
        jButton.setBackground(Color.LIGHT_GRAY); // Cor de fundo
        jButton.setForeground(Color.BLACK); // Cor do texto
        
        // Adicionar ActionListener ao botão
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Chama o método iniciar() da instância de JogoDeCartas
                jogo.iniciar();
            }
        });

        add(jButton);
        setVisible(true); // Tornar visível após adicionar componentes
    }

    public static void main(String[] args) {
   
        Jogador jogador1 = new JogadorConcreto("Jogador 1");
        Jogador jogador2 = new JogadorConcreto("Jogador 2");

        JogoDeCartas jogo = new JogoDeCartas(jogador1, jogador2);

       
        SwingUtilities.invokeLater(() -> new Screen(jogo)); // Para thread-safety
    }
}


