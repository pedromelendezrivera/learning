
package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;




public class AspiranteDAO {

    ArrayList<Aspirante> aspirantes = new ArrayList<>();

 

    public void insertar(String nombre, int edad, int añosdeexperiencia, int telefono, String ocupacion, String imagen) {
   //     try {
                aspirantes.add(new Aspirante(nombre, edad, añosdeexperiencia, telefono, ocupacion, imagen));
                 JOptionPane.showMessageDialog(null, "Aspirante agregado a los datos");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "No se pudieron agregar los datos");
//        }
    }

    
}



