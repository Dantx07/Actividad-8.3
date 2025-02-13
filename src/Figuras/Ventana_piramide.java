package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ventana_piramide extends JFrame implements ActionListener {
    private Container Contenedor;
    private JLabel Base, Altura, Apotema, Volumen, Superficie;
    private JTextField Campo_Base, Campo_Altura, Campo_Apotema;
    private JButton Calcular;

    public Ventana_piramide()   {
        Inicio();
        setTitle("Esfera");
        setSize(280,300);
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
        Base = new JLabel();
        Base.setText("Base");
        Base.setBounds(40, 20, 135, 23);
        Campo_Base = new JTextField();
        Campo_Base.setBounds(100, 20, 135, 23);
        Altura = new JLabel();
        Altura.setText("Altura");
        Altura.setBounds(40, 50, 135, 23);
        Campo_Altura = new JTextField();
        Campo_Altura.setBounds(100, 50, 135, 23);
        Apotema = new JLabel();
        Apotema.setText("Apotema");
        Apotema.setBounds(40, 80, 135, 23);
        Campo_Apotema = new JTextField();
        Campo_Apotema.setBounds(100, 80, 135, 23);
        Volumen = new JLabel();
        Volumen.setText("Volumen: ");
        Volumen.setBounds(40, 130, 135, 23);
        Superficie = new JLabel();
        Superficie.setText("Superficie: ");
        Superficie.setBounds(40, 160, 135, 23);
        Calcular = new JButton();
        Calcular.setText("Calcular");
        Calcular.setBounds(70, 230, 135, 23);
        Calcular.addActionListener(this);
        Contenedor.add(Volumen);
        Contenedor.add(Superficie);
        Contenedor.add(Calcular);
        Contenedor.add(Base);
        Contenedor.add(Campo_Base);
        Contenedor.add(Altura);
        Contenedor.add(Campo_Altura);
        Contenedor.add(Apotema);
        Contenedor.add(Campo_Apotema);
    }

    public void actionPerformed(ActionEvent evento)    {
        if (evento.getSource() == Calcular) {
            if (Campo_Base.getText().trim().isEmpty() || Campo_Altura.getText().trim().isEmpty() || Campo_Apotema.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe llenar todos los campos","Error", JOptionPane.ERROR_MESSAGE);
            }   else {
                double Base = 0;
                double Altura = 0;
                double Apotema = 0;
                Base = Double.parseDouble(Campo_Base.getText());
                Altura = Double.parseDouble(Campo_Altura.getText());
                Apotema = Double.parseDouble(Campo_Apotema.getText());
                Piramide piramide = new Piramide(Base, Altura, Apotema);
                Volumen.setText("Volumen: " + String.format("%.2f", piramide.Calcular_volumen()));
                Superficie.setText("Superficie: " + String.format("%.2f", piramide.Calcular_superficie()));
            }
        }
    }
}