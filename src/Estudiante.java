public class Estudiante extends Persona{

    //region Atributos
    private String anioIngreso;

    private int cuotaMensual;

    private String carrera;

    //endregion

    //region Constructores

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String dni, String email, String direccion, String anioIngreso, int cuotaMensual, String carrera) {
        super(nombre, apellido, dni, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    //endregion

    //region Getters, Setters y toString

    public String getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(String anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(int cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + super.toString() +
                "anioIngreso='" + anioIngreso + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", carrera='" + carrera + '\'' +
                "} ";
    }

    //endregion
}
