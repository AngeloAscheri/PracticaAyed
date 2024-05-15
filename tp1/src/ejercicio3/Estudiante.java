package ejercicio3;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String email;
    private int comision;
    private String  direccion;

    public String tusDatos(){
        return ("nombre: "+this.getNombre()+" apellido: "+this.getApellido()+" email: "+this.getEmail()+
                " direccion: "+this.getDireccion()+" comision: "+this.getComision());
    }

    public Estudiante(String nombre, String apellido, String email, int comision, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.comision = comision;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
