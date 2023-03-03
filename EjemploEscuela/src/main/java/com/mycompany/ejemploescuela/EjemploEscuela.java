/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploescuela;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author criss
 */
public class EjemploEscuela {

    public static void main(String[] args) {
        new EjemploEscuela().Menu();
    }
    
    
    List<Alumno> alumnos = new ArrayList();
    List<Profesor> profesores = new ArrayList();
    
    public void Menu(){
        Scanner sc = new Scanner(System.in);
        String eleccion = "";
        while(!eleccion.equals("4")){
            System.out.println("Seleccione una opcion");
            System.out.println("\t1. Ingresar alumno");
            System.out.println("\t2. Ingresar profesor");
            System.out.println("\t3. Ver listado de todo");
            System.out.println("\t4. Salir");
            eleccion = sc.nextLine();
            switch(eleccion){
                case "1": 
                    setAlumno();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Error, opcion incorrecta");
            }
        }
    }
    
    public int getCodigo(){
        //Regresar un numero aleatorio para el codigo del usuario
        return (int) (Math.random()*1000 + 1);
    }
    
    public void setAlumno(){
        String usuario, contraseña, nombre, apellido;
        Date fecha_nac = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        usuario = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña = sc.nextLine();
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();
        Alumno new_alumno = new Alumno(usuario, contraseña, nombre, apellido, fecha_nac, getCodigo());
        System.out.println("Usuario creado");
        System.out.println(new_alumno.getTipoDeUsuario());
        alumnos.add(new_alumno);
    }
    
    public void setProfesor(){
        String usuario, contraseña, nombre, apellido, titulo;
        Date fecha_nac = null;
        double salario;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su usuario");
        usuario = sc.nextLine();
        System.out.println("Ingrese su contraseña");
        contraseña = sc.nextLine();
        System.out.println("Ingrese su nombre");
        nombre = sc.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = sc.nextLine();
        System.out.println("Ingrese su titulo");
        titulo = sc.nextLine();
        System.out.println("Ingrese su salario");
        salario = sc.nextDouble();
        Profesor new_profesor = new Profesor(titulo, salario, usuario, contraseña, nombre, apellido, fecha_nac, getCodigo());
        System.out.println("Usuario creado");
        System.out.println(new_profesor.getTipoDeUsuario());
        profesores.add(new_profesor);
    }
}
