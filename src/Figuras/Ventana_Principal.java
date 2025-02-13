package Figuras;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ventana_Principal extends JFrame implements ActionListener{
    private Container Contenedor;
    private JButton Cilindro, Esfera, Piramide;

    public Ventana_Principal()  {
        Inicio();
        setTitle("Figuras");
        setSize(370, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void Inicio()   {
        Contenedor = getContentPane();
        Contenedor.setLayout(null);
        Cilindro = new JButton();
        Cilindro.setText("Cilindro");
        Cilindro.setBounds(20, 20, 90, 23);
        Cilindro.addActionListener(this);
        Esfera = new JButton();
        Esfera.setText("Esfera");
        Esfera.setBounds(130, 20, 90, 23);
        Esfera.addActionListener(this);
        Piramide = new JButton();
        Piramide.setText("Piramide");
        Piramide.setBounds(240, 20, 90, 23);
        Piramide.addActionListener(this);
        Contenedor.add(Cilindro);
        Contenedor.add(Esfera);
        Contenedor.add(Piramide);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == Cilindro) {
            Ventana_cilindro Cilindro = new Ventana_cilindro();
            Cilindro.setVisible(true);
            dispose();
        }
        if (evento.getSource() == Esfera)   {
            Ventana_esfera Esfera = new Ventana_esfera();
            Esfera.setVisible(true);
            dispose();
        }
        if (evento.getSource() == Piramide) {
            Ventana_piramide Piramide = new Ventana_piramide();
            Piramide.setVisible(true);
            dispose();
        }
    }
}