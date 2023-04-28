
package comboboxUsuario;

public class ListaSimple {
    private Usuario cabecera; 
    private int sizeLista = 0;
    
    //insertar
    public void insertarUsuario(String nombre_usuario){
        if (cabecera == null){
            cabecera = new Usuario();
            cabecera.setNombre_usuario(nombre_usuario);
        } else {
            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setNombre_usuario(nombre_usuario);
            
            Usuario tmp = cabecera;
            while (tmp.getSiguiente() != null){
                tmp = tmp.getSiguiente();
            }
            tmp.setSiguiente(nuevoUsuario);
        }
        sizeLista++;
    }
    
    //recorrer
    public String[] getArrayUsuarios(){
        if(cabecera != null){
            String[] arrayUsuario = new String[sizeLista];
            
            int contador = 0;
            Usuario tmp = cabecera;
            while(tmp != null){
                arrayUsuario[contador] = tmp.getNombre_usuario();
                tmp = tmp.getSiguiente();
                contador++;
            }
            return arrayUsuario;
        }
        return new String[0];
    }
}
