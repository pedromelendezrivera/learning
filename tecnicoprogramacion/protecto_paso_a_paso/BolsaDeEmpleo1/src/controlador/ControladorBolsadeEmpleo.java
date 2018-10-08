
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.AspiranteDAO;
import vista.BolsadeEmpleo;



public class ControladorBolsadeEmpleo implements ActionListener {

    BolsadeEmpleo vistaaspirantes = new BolsadeEmpleo();
    AspiranteDAO modeloaspirante = new AspiranteDAO();

    JFileChooser seleccionado = new JFileChooser();  //abre ventana para seleccionar un archivo
    File archivo;                                    //carga el archivo seleccionado con JFileChooser
    
    public ControladorBolsadeEmpleo(BolsadeEmpleo vistaaspirantes, AspiranteDAO modeloaspirante) {
        this.vistaaspirantes = vistaaspirantes;
        this.modeloaspirante = modeloaspirante;

        vistaaspirantes.agregar.addActionListener(this);
        vistaaspirantes.examinar.addActionListener(this);
                }

    @Override
    public void actionPerformed(ActionEvent e) {
  
             if (e.getSource() == vistaaspirantes.agregar) {

                String nombre = vistaaspirantes.nombre.getText();
                int edad = Integer.parseInt(vistaaspirantes.edad.getText());
                int añosdeexperiencia = Integer.parseInt(vistaaspirantes.anios.getText());
                int telefono = Integer.parseInt(vistaaspirantes.telefono.getText());
                String ocupacion = String.valueOf(vistaaspirantes.profesion.getSelectedItem());
                String imagen = vistaaspirantes.img.getText();
                
                modeloaspirante.insertar(nombre, edad, añosdeexperiencia, telefono, ocupacion, imagen);
                 
                }//vistaaspirantes.agregar
             
             if (e.getSource() == vistaaspirantes.examinar) {
                if (seleccionado.showDialog(null, "Abrir Imagen") == JFileChooser.APPROVE_OPTION) {
                    archivo = seleccionado.getSelectedFile();
                    String path = archivo.toString();

                    if (archivo.canRead()) {
                       if (archivo.getName().endsWith("JPG") ||archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                          vistaaspirantes.img.setText(path);
                          JOptionPane.showMessageDialog(null, "Se ha cargado con éxito");
                        } else {
                        JOptionPane.showMessageDialog(null, "Por favor seleccione un archivo de imagen.");
                        }
                    }
            }
        }//vistaaspirantes.examinar
    
        }//actionPerformed
 }//class

   
