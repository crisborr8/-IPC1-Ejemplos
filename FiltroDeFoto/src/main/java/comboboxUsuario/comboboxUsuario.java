package comboboxUsuario;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class comboboxUsuario extends JFrame{
    
    private JButton btnMostar;
    private JButton btnSimularEntrada;
    private JComboBox comboBox;
    private ListaSimple listaSimple;
    
    
    public comboboxUsuario(){
        setTitle("ComboboxUsuario");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
        this.setLayout(new FlowLayout());
        
        comboBox = new JComboBox<>(new String[]{});
        add(comboBox);
        
        btnMostar = new JButton("Mostrar usuarios");
        btnMostar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Agregamos los datos de la lista al combobox
                comboBox.removeAllItems();
                String[] listaUsuarios = listaSimple.getArrayUsuarios();
                for(int i = 0; i < listaUsuarios.length; i++){
                    comboBox.addItem(listaUsuarios[i]);
                }
            }
        });
        add(btnMostar);
        
        btnSimularEntrada = new JButton("Agregar usuarios a la lista");
        btnSimularEntrada.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Llamamos a un metodo para simular el llenado de datos en la lista simple
                agregarUsuarioAleatorio();
            }
        });
        add(btnSimularEntrada);
        
        listaSimple = new ListaSimple();
    }
    
    private void agregarUsuarioAleatorio(){
        String[] bancoDeUsuarios = {"usr1", "usr2", "usr3", "usr4"};
        for(int i = 0; i < bancoDeUsuarios.length; i++){
            listaSimple.insertarUsuario(bancoDeUsuarios[i]);
        }
    }
    
    
    public static void main (String [] args){
        new comboboxUsuario();
    }
}
