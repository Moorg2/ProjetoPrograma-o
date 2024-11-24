package interfaceGrafica;

import ProjetoProgramacao.JogoDeCartas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame {


    public Screen() {
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
            }
        });

        add(jButton);
        setVisible(true); // Tornar visível após adicionar componentes
    }

    public static void main(String[] args) {

    }
}


