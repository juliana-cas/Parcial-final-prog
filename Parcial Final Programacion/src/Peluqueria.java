public class Peluqueria {

    public int id;
    private String nombrePeluqueria;
    private String Correo;
    private String direccion;

    private String telefono;

    public Peluqueria(int id, String nombrePeluqueria, String Correo, String direccion, String telefono) {
        this.id = id;
        this.nombrePeluqueria = nombrePeluqueria;
        this.Correo = Correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePeluqueria() {
        return nombrePeluqueria;
    }

    public void setNombrePeluqueria(String nombrePeluqueria) {
        this.nombrePeluqueria = nombrePeluqueria;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getDireccion() {return direccion; }

    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {return telefono; }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n"+
                "nombre Peluqueria: " + nombrePeluqueria + '\n' +
                "Correo: " + Correo + '\n' +
                "Direccion: " + direccion + '\n' +
                "Telefono: " + telefono + '\n';

    }
}
