/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author felipedania
 */
public interface InterfaceGrafic {

    public class InterfaceGrafica extends JFrame implements ActionListener {

        public JPanel painel;
        public JButton btn1;
        public JButton btn2;
        public JButton btn3;

        public static void main(String[] args) {
            new InterfaceGrafica();

        }

        public InterfaceGrafica() {

            super("INICIO");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            painel = new JPanel();
            painel.setBackground(Color.yellow);

            btn1 = new JButton("Clique aqui");
            btn2 = new JButton("Botão 2");
            btn2 = new JButton("Botão 3");
            btn1.addActionListener(this);

            painel.add(btn1);
            painel.add(btn2);
            painel.add(btn3);
            painel.setAlignmentX(50);
            painel.setAlignmentY(50);
            this.add(painel);
            this.setSize(300, 300);
            this.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            btn1.setText("Botão Clicado!");
        }

    }

}
