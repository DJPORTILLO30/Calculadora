import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {
    Font fuente = new Font("Arial", Font.PLAIN, 40);
    Font fuente_entrada = new Font("Agency FB", Font.PLAIN, 40);
    UI(){
        getContentPane().setBackground(Color.black);
        setSize(400,500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);

        JTextField entrada = new JTextField("");
        entrada.setBounds(50,25,300,80);
        entrada.setFont(fuente_entrada);
        entrada.setBackground(Color.black);
        entrada.setBorder(null);
        entrada.setHorizontalAlignment(JTextField.RIGHT);
        entrada.setEditable(false);

        JButton boton_1 = new JButton("1");
        boton_1.setBounds(0,200,100,70);
        boton_1.setBorder(null);
        boton_1.setFont(fuente);
        boton_1.setBackground(Color.black);
        boton_1.setForeground(Color.white);
        boton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText(entrada.getText()+"1");
            }
        });


        JButton boton_2 = new JButton("2");
        boton_2.setBorder(null);
        boton_2.setBounds(100,200,100,70);
        boton_2.setFont(fuente);
        boton_2.setBackground(Color.black);
        boton_2.setForeground(Color.white);
        boton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText(entrada.getText()+"2");
            }
        });

        JButton boton_3 = new JButton("3");
        boton_3.setBorder(null);
        boton_3.setBounds(200,200,100,70);
        boton_3.setFont(fuente);
        boton_3.setBackground(Color.black);
        boton_3.setForeground(Color.white);
        boton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                entrada.setText(entrada.getText()+"3");
            }
        });

        JButton borrar = new JButton("→");
        borrar.setBorder(null);
        borrar.setBounds(297,200,85,70);
        borrar.setFont(fuente);
        borrar.setBackground(new Color(27, 152, 11));
        borrar.setForeground(Color.white);
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pantalla;
                String aux2="";
                pantalla= entrada.getText();
                entrada.setText(pantalla.substring(0,(pantalla.length()-1)));
            }
        });

        add(entrada);
        add(boton_1);
        add(boton_2);
        add(boton_3);
        add(borrar);
        setVisible(true);
    }
}
