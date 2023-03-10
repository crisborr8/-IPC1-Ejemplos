/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplopacman;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Heredando los componentes y atributos publicos y protegido de JPanel
public class PantallaDeJuego extends JPanel{
    
    //Declarar lo que quiero mostrar en pantalla
    private JLabel pacman;
    private JLabel tiempo;
    
    //Al momento de llamar a pantalla de juego, esta empezará a dibujar o mostrar
    //en pantalla todos los componentes
    public PantallaDeJuego(){
        //Empezamos a poner las dimensiones de la ventana
        setBackground(Color.black);
        setPreferredSize(new Dimension(500, 500)); //Definimos altura y anchura
        setLayout(null); //Nos permite que el dibujado o las animaciones no se reseten
        setFocusable(true); //Nos permite detectar los input del teclado
        
        //Empezamos a declarar los componentes de pacman para dibujarlo
        pacman = new JLabel();
        pacman.setBounds(200, 50, 50, 50);
        pacman.setBackground(Color.yellow);
        pacman.setOpaque(true); //Nos permite mostrar el label sin necesidad de poner texto
        this.add(pacman);
        //add(pacman);
        
        //Declaramos los componentes del tiempo
        tiempo = new JLabel("0:00");
        //tiempo.setText("0:00");
        tiempo.setBounds(0, 0, 50, 50);
        add(tiempo);
        
        this.repaint(); //Para que se muestren los cambios en pantalla
        
        //Definimos el comportamiento del pacman para que actue cuando haga un click con el teclado
        addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //Detectamos cuando se presione arriba, abajo, derecha o izquierda
                //Para esto primero detectamos el ascii de la tecla
                int codigoTecla = e.getKeyCode();
                if(codigoTecla == KeyEvent.VK_UP || codigoTecla == KeyEvent.VK_W){
                    pacman.setLocation(pacman.getX(), pacman.getY() - 10);
                }
                else if(codigoTecla == KeyEvent.VK_DOWN || codigoTecla == KeyEvent.VK_S){
                    pacman.setLocation(pacman.getX(), pacman.getY() + 10);
                }
                else if(codigoTecla == KeyEvent.VK_LEFT || codigoTecla == KeyEvent.VK_A){
                    pacman.setLocation(pacman.getX() - 10, pacman.getY());
                }
                else if(codigoTecla == KeyEvent.VK_RIGHT || codigoTecla == KeyEvent.VK_D){
                    pacman.setLocation(pacman.getX() + 10, pacman.getY());
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        
        //Llamamos al hilo del tiempo
        HiloDeTiempo hiloTiempo = new HiloDeTiempo(tiempo);
        //Iniciamos el hilo con start
        hiloTiempo.start();
    }
    
}
