import java.util.Date;

public class Docente implements ServMedico {
    private String rfc;
    private Date fecIngreso;
    private CVitae experiencia;

    public Docente(String rfc, Date fecIngreso, CVitae experiencia) {
        this.rfc = rfc;
        this.fecIngreso = fecIngreso;
        this.experiencia = experiencia;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setFecIngreso(Date fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    public void getRfc() {
        System.out.println(rfc);
    }

    public void getFecIngreso() {
        System.out.println(fecIngreso);
    }

    public void getFecIngreso(String texto) {
        System.out.println(texto + fecIngreso);
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
