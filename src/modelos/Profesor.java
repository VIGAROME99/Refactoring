package modelos;

import java.util.ArrayList;

public class Profesor {
    public String codigo;
    public String nombre;
    public String apellido;
    public int edad;
    public String direccion;
    public String telefono;
    public ArrayList<Paralelo> paralelos;
    //class InformacionAdicionalProfesor
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;
    

    public Profesor(String codigo, String nombre, String apellido, int edad, String direccion, String telefono, int añosdeTrabajo, String facultad, double BonoFijo, ArrayList<Paralelo> paralelos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.añosdeTrabajo = añosdeTrabajo;
        this.facultad = facultad;
        this.BonoFijo = BonoFijo;
        this.paralelos = paralelos;
    }

    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }
    
    
}
