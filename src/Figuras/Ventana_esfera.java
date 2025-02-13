package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana_esfera extends JFrame implements ActionListener {
    private Container Contenedor;
    private JLabel Radio, Volumen, Superficie;
    private JTextField Campo_Radio;
    private JButton Calcular;

    public Ventana_esfera()   {
        Inicio();
        setTitle("Esfera");
        setSize(280,250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    private void Inicio()   {
        Contenedor = getContentPane();
        Contenedor.setLayout(null);
        Radio = new JLabel();
        Radio.setText("Radio");
        Radio.setBounds(40, 20, 135, 23);
        Campo_Radio = new JTextField();
        Campo_Radio.setBounds(100, 20, 135, 23);
        Volumen = new JLabel();
        Volumen.setText("Volumen: ");
        Volumen.setBounds(40, 70, 135, 23);
        Superficie = new JLabel();
        Superficie.setText("Superficie: ");
        Superficie.setBounds(40, 100, 135, 23);
        Calcular = new JButton();
        Calcular.setText("Calcular");
        Calcular.setBounds(70, 170, 135, 23);
        Calcular.addActionListener(this);
        Contenedor.add(Volumen);
        Contenedor.add(Superficie);
        Contenedor.add(Calcular);
        Contenedor.add(Radio);
        Contenedor.add(Campo_Radio);
    }

    public void actionPerformed(ActionEvent evento)    {
        if (evento.getSource() == Calcular) {
            if (Campo_Radio.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","Error", JOptionPane.ERROR_MESSAGE);
            }   else {
                double Radio = 0;
                Radio = Double.parseDouble(Campo_Radio.getText());
                Esfera esfera = new Esfera(Radio);
                Volumen.setText("Volumen: " + String.format("%.2f", esfera.Calcular_volumen()));
                Superficie.setText("Superficie: " + String.format("%.2f", esfera.Calcular_superficie()));
            }
        }
    }
}