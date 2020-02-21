package examen1_davidreyes;

import java.util.ArrayList;

public class Normales extends Alumnos {
    private ArrayList examenes;

    public Normales(ArrayList examenes, String Nombre, int edad, String carrera, String lugar, String cuenta, String usuario, String contra) {
        super(Nombre, edad, carrera, lugar, cuenta, usuario, contra);
        this.examenes = examenes;
    }
    
}
