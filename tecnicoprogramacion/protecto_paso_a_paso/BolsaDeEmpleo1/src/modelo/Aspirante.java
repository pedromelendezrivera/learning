
package modelo;

import java.util.ArrayList;

/**
 *
 * clase VO AspiranteVO
 */
public class Aspirante implements Comparable<Aspirante>{

    String nombre;
    int edad;
    int añosdeexperiencia;
    int telefono;
    String ocupacion;
    String imagen;

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Aspirante(String nombre, int edad, int añosdeexperiencia, int telefono, String ocupacion, String imagen) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosdeexperiencia = añosdeexperiencia;
        this.telefono = telefono;
        this.ocupacion = ocupacion;
        this.imagen = imagen;
        
    }

    public Aspirante() {
        nombre = "";
        edad = 0;
        añosdeexperiencia = 0;
        telefono = 0;
        ocupacion = "";
        imagen = "";
    }

    Aspirante(ArrayList<Aspirante> contratados) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosdeexperiencia() {
        return añosdeexperiencia;
    }

    public void setAñosdeexperiencia(int añosdeexperiencia) {
        this.añosdeexperiencia = añosdeexperiencia;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getOcupacion() {
        return ocupacion;
    }


    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

//    @Override
//    public int compareTo(Aspirante o) {
//        return ocupacion.compareTo(o.getOcupacion());
//    }

    @Override
    public int compareTo(Aspirante o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
