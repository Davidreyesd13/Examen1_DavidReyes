package examen1_davidreyes;

public class Alumnos {

    private String Nombre;
    private int edad;
    private String carrera;
    private String lugar;
    private String cuenta;
    private String usuario;
    private String contra;

    public Alumnos(String Nombre, int edad, String carrera, String lugar, String cuenta, String usuario, String contra) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.lugar = lugar;
        this.cuenta = cuenta;
        this.usuario = usuario;
        this.contra = contra;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "Nombre=" + Nombre + ", edad=" + edad + ", carrera=" + carrera + ", lugar=" + lugar + ", cuenta=" + cuenta + ", usuario=" + usuario + ", contra=" + contra + '}';
    }

}
