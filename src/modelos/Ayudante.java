package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    public ArrayList<Paralelo> paralelos;

    public Ayudante(String matricula, String nombre, String apellido, String facultad, int edad, String direccion, String telefono, ArrayList<Paralelo> paralelos_est, ArrayList<Paralelo> paralelos_ayudante) {
        super(matricula, nombre, apellido, facultad, edad, direccion, telefono, paralelos_est);
        this.paralelos = paralelos_ayudante;
    }
    //Método para imprimir los paralelos que tiene asignados como ayudante
    public void MostrarParalelos(){
        for(Paralelo par:paralelos){
            //Muestra la info general de cada paralelo
        }
    }
}
