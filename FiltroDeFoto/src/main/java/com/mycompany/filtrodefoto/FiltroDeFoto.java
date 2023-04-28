package com.mycompany.filtrodefoto;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FiltroDeFoto extends JFrame{

    //Pasos a seguir para realizar el programa
    /*
        1. Abrir y mostrar la foto
        2. Aplicar un filtro (blanco y negro)
        3. Guardar la foto
        4. Permitir aplicar otros filtros (rojo, verde y azul)
        5. Abrir y mostrar mas de una foto (Lista doblemente enlazada circular)
    */
    
    /*
        Para el paso 1
        1. heredar de la clase JFrame
        2. Realizar la configuración del JFrame en el constructor
        3. Hacer que se dibuje el JFrame en medio de la pantalla
        4. Colocar botones y labels para mostrar la imagen
        5. Configurar el boton para que pueda abrir archivos
        6. Configurar el boton para que el archivo abierto se muestre en el jlabel
    */
    /*
        Para el paso 2
        1. Agregar el boton para aplicar el filtro
        2. Aplicar el filtro
        3. Mostrar la imagen con el filtro aplicado
    */
    /*
        Para el paso 3
        1. Almacenamos la imagen del JLabel en memoria
        2. Abrir un JFileChooser para guardar el archivo
        3. Obtenemos la ruta del archivo
        4. Guardamos el archivo con la extencion determinada
    */
    /*
        Para el paso 5
        1. Crear una lista simple circular 
        2. Creamos una cabecera o header que nos indique donde inicia la lista
    */
    
    private JButton btnAbrir;
    //private JButton btnFiltroBN;
    private JButton btnFiltro;
    private JButton btnGuardar;
    private JLabel lblImagen;
    private JComboBox<String> comboBox;
    private ListaCircular listaCircular;
    private JButton btnSiguienteImagen;
    private JButton btnResetFiltro;
    
    public FiltroDeFoto(){
        setTitle("QuickPhoto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
        //Modificamos el JFrame para que este se muestre en medio de la pantalla
        //Otra forma de hacerlo -> this.setLocationRelativeTo(null);
        Dimension dimensionDePantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int anchoPantalla = dimensionDePantalla.width;
        int altoPantalla = dimensionDePantalla.height;
        int anchoJFrame = getWidth();
        int altoJFrame = getHeight();
        int posX = (anchoPantalla - anchoJFrame)/2;
        int posY = (altoPantalla - altoJFrame)/2;
        setLocation(posX, posY);
        
        
        //Atributos y características de los componentes
        this.setLayout(new FlowLayout());
        //Para el JLabel de imagen
        lblImagen = new JLabel();
        add(lblImagen);
        //Para el JButton de Abrir
        btnAbrir = new JButton("Abrir");
        btnAbrir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Utilizar la libreria JFileChooser para mostrar una ventana que abra un archivo
                JFileChooser fileChooser = new JFileChooser();
                //Añadimos un filtro para que solo se muestren archivos .jpg, .png y .jpeg
                FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de imagen", "jpg", "png", "jpeg");
                //Atachamos el filtro al fileChooser
                fileChooser.setFileFilter(filtro);
                //Obtenemos que boton se presionó en el fileChooser
                int seleccionDeBoton = fileChooser.showOpenDialog(null);
                //Si se seleccionó "abrir archivo"
                if(seleccionDeBoton == JFileChooser.APPROVE_OPTION){
                    try {
                        //Cargar el archivo
                        File archivo = fileChooser.getSelectedFile();
                        //Vamos a cargar el archivo como una imagen
                        Image imagen = ImageIO.read(archivo);
                        
                        //Configuramos las dimensiones de la imagen para que esta siempre mida lo mismo
                        int ancho = imagen.getWidth(null);
                        int alto = imagen.getHeight(null);
                        if (ancho > 300 || alto > 300){
                            //calculo de la escala correcta 
                            double escala = Math.min(300.0/ancho, 300.0/alto);
                            int nuevoAncho = (int) (ancho*escala);
                            int nuevoAlto = (int) (alto*escala);
                            //Ya teniendo las nuevas dimensiones ajustamos la imagen
                            imagen = imagen.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);                        
                        }
                        
                        //Poner la imagen en el JLabel
                        lblImagen.setIcon(new ImageIcon(imagen));
                        
                        //Insertar la imagen en la lista
                        listaCircular.insertarImagen(new ImageIcon(imagen));
                        
                    } catch (IOException ex) {
                        Logger.getLogger(FiltroDeFoto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        add(btnAbrir);
        
        /*
        btnFiltroBN = new JButton("Aplicar Filtro BN");
        btnFiltroBN.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                filtroBN();
            }
        });
        add(btnFiltroBN);
        */
        btnFiltro = new JButton("Filtrar");
        btnFiltro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String filtroSeleccionado = (String) comboBox.getSelectedItem();
                switch(filtroSeleccionado){
                    case "Blanco y negro":
                        filtroBN();
                        break;
                    case "Rojo":
                        filtroRed();
                        break;
                    case "Azul":
                        filtroBlue();
                        break;
                }
            }
        });
        add(btnFiltro);
        
        btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                guardar();
            }
        });
        add(btnGuardar);
        
        comboBox = new JComboBox<>(new String[]{"Blanco y negro", "Rojo", "Azul"});
        add(comboBox);
        
        listaCircular = new ListaCircular();
        btnSiguienteImagen = new JButton("Siguiente");
        btnSiguienteImagen.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImagen.setIcon(listaCircular.getImagenActual());
            }
        });
        add(btnSiguienteImagen);
        
        btnResetFiltro = new JButton("Reset");
        btnResetFiltro.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                lblImagen.setIcon(listaCircular.resetImagen());
            }
        });
        add(btnResetFiltro);
    }
    
    private void filtroBN(){
        //Obtener la imagen en el JLabel
        ImageIcon icono = (ImageIcon) lblImagen.getIcon();
        //Verificamos que exista una imagen cargada en el lblImagen
        if(icono != null){
            //Cargo la imagen en una variable tipo Image
            Image imagen = icono.getImage();
            //Cargamos la imagen en memoria para poder modificarla 
            BufferedImage bufferedImage = new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            //Dibujar la imagen en memoria
            Graphics g = bufferedImage.getGraphics();
            g.drawImage(imagen, 0, 0, null);
            g.dispose();
            //Recorrer pixel por pixel para cambiar los valores de RGB en ese pixel
            for(int i = 0; i < bufferedImage.getWidth(); i++){
                for(int j = 0; j < bufferedImage.getHeight(); j++){
                    //Almacenamos los valores RGB del pixel
                    Color pixelColor = new Color(bufferedImage.getRGB(i, j));
                    //Sacamos un promedio de los valores RGB
                    int promedio = (pixelColor.getRed() + pixelColor.getBlue() + pixelColor.getGreen())/3;
                    //Aplicamos el filtro a un nuevo pixel
                    Color nuevo_pixelColor = new Color(promedio, promedio, promedio);
                    //Repintamos el pixel para aplicar el filtro
                    bufferedImage.setRGB(i, j, nuevo_pixelColor.getRGB());
                }
            }
            //Colocar la imagen con filtro en el JLabel
            lblImagen.setIcon(new ImageIcon(bufferedImage));
            //Actualizamos el filtro de la imagen en la lista
            listaCircular.actualizarImagen(new ImageIcon(bufferedImage));
        }
    }
    private void filtroRed(){
        //Obtener la imagen en el JLabel
        ImageIcon icono = (ImageIcon) lblImagen.getIcon();
        //Verificamos que exista una imagen cargada en el lblImagen
        if(icono != null){
            //Cargo la imagen en una variable tipo Image
            Image imagen = icono.getImage();
            //Cargamos la imagen en memoria para poder modificarla 
            BufferedImage bufferedImage = new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            //Dibujar la imagen en memoria
            Graphics g = bufferedImage.getGraphics();
            g.drawImage(imagen, 0, 0, null);
            g.dispose();
            //Recorrer pixel por pixel para cambiar los valores de RGB en ese pixel
            for(int i = 0; i < bufferedImage.getWidth(); i++){
                for(int j = 0; j < bufferedImage.getHeight(); j++){
                    //Almacenamos los valores RGB del pixel
                    Color pixelColor = new Color(bufferedImage.getRGB(i, j));
                    //Sacamos un promedio de los valores RGB
                    int promedio = (pixelColor.getRed() + pixelColor.getBlue() + pixelColor.getGreen())/3;
                    //Aplicamos el filtro a un nuevo pixel
                    Color nuevo_pixelColor = new Color(promedio, 0, 0);
                    //Repintamos el pixel para aplicar el filtro
                    bufferedImage.setRGB(i, j, nuevo_pixelColor.getRGB());
                }
            }
            //Colocar la imagen con filtro en el JLabel
            lblImagen.setIcon(new ImageIcon(bufferedImage));
            //Actualizamos el filtro de la imagen en la lista
            listaCircular.actualizarImagen(new ImageIcon(bufferedImage));
        }
    }
    private void filtroBlue(){
        //Obtener la imagen en el JLabel
        ImageIcon icono = (ImageIcon) lblImagen.getIcon();
        //Verificamos que exista una imagen cargada en el lblImagen
        if(icono != null){
            //Cargo la imagen en una variable tipo Image
            Image imagen = icono.getImage();
            //Cargamos la imagen en memoria para poder modificarla 
            BufferedImage bufferedImage = new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            //Dibujar la imagen en memoria
            Graphics g = bufferedImage.getGraphics();
            g.drawImage(imagen, 0, 0, null);
            g.dispose();
            //Recorrer pixel por pixel para cambiar los valores de RGB en ese pixel
            for(int i = 0; i < bufferedImage.getWidth(); i++){
                for(int j = 0; j < bufferedImage.getHeight(); j++){
                    //Almacenamos los valores RGB del pixel
                    Color pixelColor = new Color(bufferedImage.getRGB(i, j));
                    //Sacamos un promedio de los valores RGB
                    int promedio = (pixelColor.getRed() + pixelColor.getBlue() + pixelColor.getGreen())/3;
                    //Aplicamos el filtro a un nuevo pixel
                    Color nuevo_pixelColor = new Color(0, 0, promedio);
                    //Repintamos el pixel para aplicar el filtro
                    bufferedImage.setRGB(i, j, nuevo_pixelColor.getRGB());
                }
            }
            //Colocar la imagen con filtro en el JLabel
            lblImagen.setIcon(new ImageIcon(bufferedImage));
            //Actualizamos el filtro de la imagen en la lista
            listaCircular.actualizarImagen(new ImageIcon(bufferedImage));
        }
    }
    
    private void guardar(){
        //Obtener la imagen en el JLabel
        ImageIcon icono = (ImageIcon) lblImagen.getIcon();
        //Verificamos que exista una imagen cargada en el lblImagen
        if(icono != null){
            //Cargo la imagen en una variable tipo Image
            Image imagen = icono.getImage();
            //Cargamos la imagen en memoria para poder modificarla 
            BufferedImage bufferedImage = new BufferedImage(imagen.getWidth(null), imagen.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            //Dibujar la imagen en memoria
            Graphics g = bufferedImage.getGraphics();
            g.drawImage(imagen, 0, 0, null);
            g.dispose();
            
            //Mostrar el JFileChooser para elegir donde guardar la imagen
            JFileChooser fileChooser = new JFileChooser();
            //Cambiamos el titulo a "Guardar archivo"
            fileChooser.setDialogTitle("Guardar archivo");
            //Añadimos un filtro para que solo se muestren archivos .jpg, .png y .jpeg
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo de imagen","png", "jpg", "jpeg");
            //Atachamos el filtro al fileChooser
            fileChooser.setFileFilter(filtro);
            //Obtenemos que boton se presionó en el fileChooser
            int seleccionDeBoton = fileChooser.showSaveDialog(null);
            //Si se acepto guardar el archivo
            if(seleccionDeBoton == JFileChooser.APPROVE_OPTION){
                File archivo = fileChooser.getSelectedFile();
                String nombreDeArchivo = archivo.getName();
                String extension = "";
                int posPunto = nombreDeArchivo.lastIndexOf(".");
                if(posPunto > 0){
                    //imagen.pdf    /escritorio/a.jpg
                    //imagen . jpg
                    extension = nombreDeArchivo.substring(posPunto+1);
                }
                if(!extension.equals("jpg") && !extension.equals("jpeg") && !extension.endsWith("png")){
                    //Añadimos la extension al archivo
                    archivo = new File(archivo.getAbsolutePath() + ".png");
                    extension = "png";
                }
                //Verificamo si el archivo existe y si no existe lo creamos
                if(!archivo.exists()){
                    try {
                        archivo.createNewFile();
                    } catch (IOException ex) {
                        Logger.getLogger(FiltroDeFoto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    //Guardamos la imagen en el archivo
                    ImageIO.write(bufferedImage, extension, archivo);
                    JOptionPane.showMessageDialog(this, "Imagen guardad con exito :D");
                } catch (IOException ex) {
                    Logger.getLogger(FiltroDeFoto.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Error, no hay ninguna imagen cargada :c");
        }
    }
    
    
    public static void main(String[] args) {
        new FiltroDeFoto();
    }
}
