package main;

import controlador.ControladorBolsadeEmpleo;
import vista.BolsadeEmpleo;
import modelo.AspiranteDAO;

/**
 * RF1 agregar nuevas hojas de vida de aspirantes
 * @author PMELENDEZ
 */

public class Main {

    public static void main(String[] args) {
        BolsadeEmpleo vistaa = new BolsadeEmpleo();
        AspiranteDAO modeloa = new AspiranteDAO();
        new ControladorBolsadeEmpleo(vistaa, modeloa);
        vistaa.setVisible(true);
        vistaa.setLocationRelativeTo(null);
    }
}
