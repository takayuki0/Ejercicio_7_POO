public class Alumno implements ServMedico {
    private String matricula;
    private String carrera;

    public Alumno(String matricula, String carrera) {
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void getMatricula() {
        System.out.println(matricula);
    }

    public void getCarrera() {
        System.out.println(carrera);
    }


    @Override
    public void regProvedor() {

    }

    @Override
    public void regVigenciaServicio() {

    }

    @Override
    public void regNSegS() {

    }
}