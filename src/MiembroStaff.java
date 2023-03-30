public class MiembroStaff extends Persona{

    //region Atributos
    private int salario;

    private String turno;

    //endregion

    //region Constructores

    public MiembroStaff() {
    }

    public MiembroStaff(String nombre, String apellido, String dni, String email, String direccion, int salario, String turno) {
        super(nombre, apellido, dni, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    //endregion

    //region Getters, Setters y toString

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "MiembroStaff{" + super.toString() +
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                "} ";
    }
    /*
    public String toString()
    {
        return "MiembroStaff{nombre= "+super.getNombre() +" apellido= " + super.getApellido() +
                " dni= " + super.getDni()+
                " direccion= " + super.getDireccion() +
                " email= " + super.getEmail()+
                "salario=" + salario +
                ", turno='" + turno + '\'' +
                "} ";
    }*/
    //endregion
}
