
package com.mycompany.ejemploescuela;


import java.util.Date;
//para heredar los atributos y comportamientos de una clase (en este caso usuario)
//hacemos uso de la palabra reservada extends
public class Alumno extends Usuario {
    
    //Creamos nuestro constructor
    public Alumno(String usuario, String contraseña, String nombre, String apellido, Date fecha_nac, int codigo) {
        //Indica el uso de algún metodo de la clase padre (la clase usuario)
        super(usuario, contraseña, nombre, apellido, fecha_nac, codigo);
    }
    
    //Sobre escribe el método getTipoDeUsuario de la clase padre Usuario
    @Override
    public String getTipoDeUsuario(){
        return "Usuario alumno";
    }
}
