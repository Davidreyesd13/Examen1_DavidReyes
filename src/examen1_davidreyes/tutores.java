package examen1_davidreyes;

import java.util.ArrayList;

public class tutores extends Alumnos{
private ArrayList clases;
private int ganancias;
private int tutosdadas;

    public tutores(ArrayList clases, int ganancias, int tutosdadas, String Nombre, int edad, String carrera, String lugar, String cuenta, String usuario, String contra) {
        super(Nombre, edad, carrera, lugar, cuenta, usuario, contra);
        this.clases = clases;
        this.ganancias = ganancias;
        this.tutosdadas = tutosdadas;
    }

}
