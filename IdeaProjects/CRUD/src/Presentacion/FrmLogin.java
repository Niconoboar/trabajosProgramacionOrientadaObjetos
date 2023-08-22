package Presentacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;



public class FrmLogin {
    Connection con;
    Statement st;
    String usuario="root";
    String contrasenia="";
    String ruta="jdbc:mysql://localhost:3307/biblioteca_wissen";
    String user= "miTextoUser.getText()";
    String password ="miTextoPassword.getText()";




    //GENERAR METODO CONSTRUCTOR
    public FrmLogin(int ancho, int alto) {
        //VENTANA
        JFrame miVentana = new JFrame("Iniciar secion");
        try{
            Connection con = DriverManager.getConnection(ruta,usuario,contrasenia);
            System.out.println("conexion exitosa"+con.toString());
            st = con.createStatement();

        } catch (SQLException error){
            System.out.println("error: "+error.getMessage());
        }
        //PARA PERSONALIXAR POSICION DE LOS ELEMENTOS
        miVentana.getContentPane().setLayout(null);
        //ESTABLECE TAMA;OO DE LA VENTANA
        miVentana.setSize(ancho,alto);

        //PANEL
        JPanel miPanel = new JPanel();
        miPanel.setBackground(Color.DARK_GRAY);

        //CAJA DE TEXTO
        JTextField miTextoUser = new JTextField();
        miTextoUser.setText("");
        JTextField miTextoPassword = new JTextField();
        miTextoPassword.setText("");

        //UBICAR CAJA DE TEXTO EN COORDENADAS 'X' 'Y'
        miTextoUser.setBounds(165,90,150,50);
        miVentana.add(miTextoUser);
        miTextoPassword.setBounds(165,200,150,50);
        miVentana.add(miTextoPassword);

        //LABEL
        JLabel miLabelUser = new JLabel("Usuario");
        JLabel miLabelPassword = new JLabel("Contrasenia");

        //UBICAR LABEL EN COORDENADA
        miLabelUser.setBounds(165,50,150,50);
        miVentana.add(miLabelUser);
        miLabelPassword.setBounds(165,155,150,50);
        miVentana.add(miLabelPassword);

        //BOTON
        Button btnIngresar = new Button("Ingresar");
        Button btnRegistrar = new Button("Registrar");
        Button btnEditar = new Button("Editar");
        Button btnBorrar = new Button("Borrar ");
        Button btnMostrar = new Button("Borrar ");

        //UBICAR AL BOTON EN COORDENADAS 'X' 'Y'
        btnIngresar.setBounds(80,300,150,50);
        btnRegistrar.setBounds(250,300,150,50);
        btnEditar.setBounds(80,380,150,50);
        btnBorrar.setBounds(250,380,150,50);
        btnMostrar.setBounds(160,450,150,50);

        //LLAMAR AL BOTON DENTRO DE LA VENTANA
        miVentana.add(btnIngresar);
        miVentana.add(btnRegistrar);
        miVentana.add(btnEditar);
        miVentana.add(btnBorrar);
        miVentana.add(btnMostrar);

        //AGREGAR EVENTO AL BOTON INGRESAR
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultSet rs = null;
                Boolean existe = false;

                try{
                    String sql = "SELECT nombre_usuario, clave_usuario FROM biblioteca_wissen.usuario";
                    rs = st.executeQuery(sql);
                    while(rs.next()){
                    System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
                    }

                } catch (SQLException error){
                    System.out.println("error: "+error.getMessage());
                }
//mensaje emergente

                if (user.equals(miTextoUser.getText()) && password.equals(miTextoPassword.getText())) {
                    JOptionPane.showMessageDialog(null, "Bienvenide " + miTextoUser.getText(), "INGRESO", JOptionPane.INFORMATION_MESSAGE);
                    // Crear y mostrar la ventana FrmHome
                    FrmHome home = new FrmHome();
                    home.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Lo sentimos " + miTextoUser.getText() + ". No te conocemos, por favor regístrate.", "LOGIN", JOptionPane.WARNING_MESSAGE);
                }


            }
        });

        //AGREGAR EVENTO AL BOTON REGISTRAR
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = miTextoUser.getText();
                String password = miTextoPassword.getText();

                try{
                    String sql ="INSERT into (nombre_usuario, clave_usuario) values (?,?);";
                    PreparedStatement ps =con.prepareStatement(sql);
                    ps.setString(1, user);
                    ps.setString(2, password);
                    if (ps.executeUpdate()>0){
                        JOptionPane.showMessageDialog(null, "dato insertado","Insertar",1);
                    }
                }catch (SQLException error){
                    System.out.println("Error: "+error.getMessage());
                }



            }
        });


        //AGREGAR EVENTO AL BOTON EDITAR
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //AGREGAR EVENTO AL BOTON BORRAR
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //AGREGAR EVENTO AL BOTON MOSTRAR
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        //MOSTRAR EL VENTANA
        miVentana.setVisible(true);


    }
}
