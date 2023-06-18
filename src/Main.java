import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Alumno alumnoUno = new Alumno("JP8592G", "Medicina");
        Alumno alumnoDos = new Alumno("XJ2535H", "Administración");
        Alumno alumnoTres = new Alumno("NG8364X", "Arquitectura");

        Docente docenteUno = new Docente("JSKFIEHDPWIGK8", new Date(123, Calendar.JANUARY, 15), new CVitae());
        Docente docenteDos = new Docente("MLOEUTHFHSVXF5", new Date(123, Calendar.JANUARY, 21), new CVitae());
        Docente docenteTres = new Docente("XFJNSRUPMVXFQ7", new Date(123, Calendar.JANUARY, 29), new CVitae());

        System.out.print("La Carrera del Alumno uno es: ");
        alumnoUno.getCarrera();
        System.out.print("El número de matrícula del Alumno dos es: ");
        alumnoDos.getMatricula();
        System.out.print("La Carrera del Alumno tres es: ");
        alumnoTres.getCarrera();

        System.out.println();

        System.out.print("El Docente uno Ingresó en: ");
        docenteUno.getFecIngreso();
        docenteDos.getFecIngreso("El Docente dos Ingresó en: ");
        System.out.print("El Nro. de RFC del Docente Tres es: ");
        docenteTres.getRfc();
    }
}