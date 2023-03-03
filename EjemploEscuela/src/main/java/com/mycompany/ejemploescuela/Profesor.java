
package com.mycompany.ejemploescuela;


import java.util.Date;
//para heredar los atributos y comportamientos de una clase (en este caso usuario)
//hacemos uso de la palabra reservada extends
public class Profesor extends Usuario{
    
    private String titulo;
    private double salario;
    
    //Creamos nuestro constructor
    public Profesor(String titulo, double salario, String usuario, String contraseña, String nombre, String apellido, Date fecha_nac, int codigo) {
        //Indica el uso de algún metodo de la clase padre (la clase usuario)
        super(usuario, contraseña, nombre, apellido, fecha_nac, codigo);
        //Inserto el titulo y el salario
        this.titulo = titulo;
        this.salario = salario;
    }

    //Generar los get para el titulo y el salario
    public String getTitulo() {
        return titulo;
    }

    public double getSalario() {
        return salario;
    }
    
    //Sobre escribe el método getTipoDeUsuario de la clase padre Usuario
    @Override
    public String getTipoDeUsuario(){
        return "Usuario profesor";
    }
    
}
