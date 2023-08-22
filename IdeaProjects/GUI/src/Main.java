import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //VENTANA
        JFrame miVentana =  new JFrame("Mi Primera Ventana");//creamos un objeto ventana
        miVentana.setSize(600, 400);//DAR DIMENCIONES A LA VENTANA
        //PANEL
        JPanel miPanel = new JPanel();//creamos el panel que es lo que esta dentro de la ventana
        miPanel.setBackground(Color.darkGray);// le damos color al pannel
        //LABEL
        Label miLabel = new Label("Nombre: ");//creamos un label(el texto que sale antes del cuadro para escribir)
        miLabel.setForeground(Color.WHITE);//le da color a la letra del label
        miLabel.setFont(new Font("Arial",Font.BOLD,18));// le da atributos al label
        //TEXTO
        JTextField miTexto = new JTextField();//creamos un cuadro de texto
        miTexto.setBackground(Color.green);// da fondo verde al cuadro de texto
        //miTexto.setText("ingrese un nombre");
        miTexto.setPreferredSize(new Dimension(200, 30));//da dimensiones al cuadro de texto
        miTexto.setFont(new Font("Arial",Font.BOLD,18));//le da atributos al texto dentro del cuadro
        //BOTON
        Button miBoton = new Button("Aceptar!");
        miBoton.setFont(new Font("Arial",Font.BOLD,16));
       //AGREGAR MAS ELEMENTOS A PANEL
        miPanel.add(miLabel);//hacemos que el label entre en el panel
        miPanel.add(miTexto);//hacemos que el cuadro de texto entre en el panel
        miPanel.add(miBoton);//meter el boton al panner
        //AGREGAR PANEL A LA VENTANA
        miVentana.add(miPanel);// metemos al paNel dentro de la ventana


        //MOSTRAR VENTANA
        miVentana.setVisible(true);

        }

    }
