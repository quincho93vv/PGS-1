package pgs;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Login;
import javax.swing.SwingUtilities;
import javax.swing.UnsupportedLookAndFeelException;

public class PGS {

    public static void main(String[] args) {
        try {
          javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        }

        SwingUtilities.invokeLater(() -> {
            mostrarInterfaz();
        });
    }

    public static void mostrarInterfaz() {
        Modelo modelo = new Modelo();
        Controlador control = new Controlador(modelo);
        Login v = new Login(control);
        v.mostrar();
    }

}
