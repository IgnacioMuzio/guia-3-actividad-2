// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Colegio colegio = new Colegio();
        int opcion;

        do{
            Consola.escribir("1.Ingresar un alumno");
            Consola.escribir("2.Ingresar un miembro del staff");
            Consola.escribir("3.Mostrar cantidad de alumnos");
            Consola.escribir("4.Mostrar cantidad de miembros del staff");
            Consola.escribir("5.Mostrar ingreso por cuota mensualmente");
            Consola.escribir("6.Mostrar gasto en sueldos mensualmente");
            Consola.escribir("7.Mostrar lista de personas");
            opcion = Consola.leerInt("Ingrese la opcion deseada");
            Consola.limpiar();
            while (opcion < 0 || opcion > 7){
                Consola.escribir("Elija una opcion nuevamente");
                opcion = Consola.leerInt("Elija una opcion valida");
                Consola.limpiar();
            }
            menu(opcion, colegio);
        }while(opcion !=0);
    }
    //region menu
    public static void menu (int opcion, Colegio colegio){

        switch(opcion){
            case 1:
                addEstudiante(colegio);
                break;
            case 2:
                addMiembroStaff(colegio);
                break;
            case 3:
                Consola.escribir("La cantidad de alumnos en el colegio es de: "+colegio.getCantAlumnos());
                break;
            case 4:
                Consola.escribir("La cantidad de miembros de staff en el colegio es de: "+colegio.getCantStaff());
                break;
            case 5:
                Consola.escribir("El ingreso total por cuotas mensuales es de " + colegio.getIngresoCuota());
                break;
            case 6:
                Consola.escribir("El gasto total en sueldos mensualmente es de: " + colegio.getGastoSueldo());
                break;
            case 7:
                Consola.escribir(colegio.toString());
            case 0:
                Consola.escribir("Finalizando...");
        }
    }

    //endregion

    //region metodo caso 1
    public static void addEstudiante (Colegio colegio){
        String nombre = Consola.leerString("Ingrese el nombre del alumno: ");

        String apellido = Consola.leerString("Ingrese el apellido del alumno: ");

        String dni = Consola.leerString("Ingrese el dni del alumno: ");

        String email = Consola.leerString("Ingrese el email del alumno: ");

        String direccion = Consola.leerString("Ingrese la direccion del alumno: ");

        String anio = Consola.leerString("Ingrese año de ingreso: ");

        int cuota = Consola.leerInt("Ingrese el valor de su cuota mensual");
        Consola.limpiar();

        String carrera = Consola.leerString("Ingrese la carrera en la que esta inscripto: ");

        Estudiante estudiante = new Estudiante(nombre,apellido,dni,email,direccion,anio,cuota,carrera);

        colegio.addPersona(estudiante);
    }

    //endregion

    //region metodo caso 2
    public static void addMiembroStaff (Colegio colegio){
        String nombre = Consola.leerString("Ingrese el nombre del miembro: ");

        String apellido = Consola.leerString("Ingrese el apellido del miembro: ");

        String dni = Consola.leerString("Ingrese el dni del miembro: ");

        String email = Consola.leerString("Ingrese el email del miembro: ");

        String direccion = Consola.leerString("Ingrese la direccion del miembro: ");

        int salario = Consola.leerInt("Ingrese su salario");
        Consola.limpiar();

        int turnito;
        String turno;
        Consola.escribir("Ingrese el turno del miembro.");
        Consola.escribir("1.Mañana");
        Consola.escribir("2.Tarde");
        turnito = Consola.leerInt("Ingrese una opcion");
        Consola.limpiar();
        while (turnito < 1 || turnito > 2){
            Consola.escribir("Elija una opcion nuevamente");
            turnito = Consola.leerInt("Elija una opcion valida");
        }
        if(turnito == 1)
            turno = "Mañana";
        else
            turno = "Tarde";

        MiembroStaff miembro = new MiembroStaff(nombre,apellido,dni,email,direccion,salario,turno);
        colegio.addPersona(miembro);
    }

    //endregion
}