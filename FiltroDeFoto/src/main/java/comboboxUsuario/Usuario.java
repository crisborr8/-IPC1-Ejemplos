package comboboxUsuario;

public class Usuario {
    private String nombre_usuario;
    private Usuario siguiente;

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public Usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }
    
}
