import java.util.ArrayList;

public class Colegio {

    //region Atributos
    ArrayList<Persona> miembrosColegio;

    //endregion

    //region Constructor

    public Colegio() {
        this.miembrosColegio = new ArrayList<>();
    }


    //endregion

    //region Metodos
    public void addPersona (Persona personita){
        miembrosColegio.add(personita);
    }
    public int getCantAlumnos (){
        int cant=0;

        for(Persona miembro : miembrosColegio){
            if(miembro instanceof Estudiante){
                cant++;
            }
        }

        return cant;
    }

    public int getCantStaff(){
        int cant=0;

        for(Persona miembro : miembrosColegio){
            if(miembro instanceof MiembroStaff){
                cant++;
            }
        }

        return cant;
    }

    public int getIngresoCuota(){
        int ingreso=0;

        for(Persona miembro : miembrosColegio){
            if(miembro instanceof Estudiante){
                ingreso += ((Estudiante) miembro).getCuotaMensual();
            }
        }
        return ingreso;
    }

    public int getGastoSueldo(){
        int gasto = 0;

        for(Persona miembro : miembrosColegio){
            if(miembro instanceof MiembroStaff){
                gasto += ((MiembroStaff)miembro).getSalario();
            }
        }
        return gasto;
    }

    @Override
    public String toString() {
        return "Colegio{" +
                "miembrosColegio=" + miembrosColegio +
                '}';
    }

    //endregion
}
