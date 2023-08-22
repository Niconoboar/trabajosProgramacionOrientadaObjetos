package Presentacion;

import javax.swing.*;
import java.awt.*;

public class FrmHome extends JFrame {
    JLabel JLTitle;
    JLabel JLSubtitle;

    public FrmHome(){
        initGui();
        //DEFINE UN ABSOLUTE LAYAUT
        getContentPane().setLayout(null);
        JLTitle= new JLabel("Bienvenido ");
        JLSubtitle = new JLabel("Subtitulo de la ventana");
        JLTitle.setBounds(200,10, 100,50);
        add(JLTitle);
        JLSubtitle.setBounds(200,70, 150,50);
        add(JLSubtitle);
    }
    private void initGui(){
        setTitle("Home");
        setSize(600,500);

    }
}
