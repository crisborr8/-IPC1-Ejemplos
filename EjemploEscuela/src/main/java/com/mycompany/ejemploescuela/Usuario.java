package com.mycompany.ejemploescuela;

import java.util.Date;

public class Usuario {
    
    //Los atributos del usuario
    private String usuario;
    private String contraseña;
    private String nombre;
    private String apellido;
    private Date fecha_nac;
    private int codigo;
    
    //Declaramos los get de cada variable

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public int getCodigo() {
        return codigo;
    }
    
    public String getTipoDeUsuario(){
        return "Usuario generico";
    }
    
    public void cambiarContraseña(String new_contraseña){
        this.contraseña = new_contraseña;
    }
    
    //Creamos un constructor para poner los datos

    public Usuario(String usuario, String contraseña, String nombre, String apellido, Date fecha_nac, int codigo) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.codigo = codigo;
    }
    
    
}
