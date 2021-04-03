package Modelo;

public class pet {
    private String estado;
    private String especie;
    private String tama�o;
    private String localidad;
    private String direccion;
    private String nombre;
    private String telefono;
    private String email;
    private String comentarios;

    public pet(String estado, String especie, String tama�o, String localidad, String direccion, String nombre, String telefono, String email, String comentarios) {
        this.estado = estado;
        this.especie = especie;
        this.tama�o = tama�o;
        this.localidad = localidad;
        this.direccion = direccion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.comentarios = comentarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }


    public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "pet{" +
                "estado='" + estado + '\'' +
                ", especie='" + especie + '\'' +
                ", tamaño='" + tama�o + '\'' +
                ", localidad='" + localidad + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
