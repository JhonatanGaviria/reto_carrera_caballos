package caballos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    int jugadoresAc=4;
    String mensaje = "";
    public JPanel panel;
    //constructor ventana
    public Ventana(){
        setSize(500,500); //tamaño
        setTitle("Carreras de caballos"); //titulo
        setLocationRelativeTo(null); //centrar al medio
        IniciarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE); //controlar accion al boton cerrar
    }
     private void IniciarComponentes (){
        ColocarPaneles();
        colocarCajas();
    }
    private void ColocarPaneles(){
        panel = new JPanel(); // creaccion de un panel
        this.getContentPane().add(panel); //agregamos el panel a la ventana
        panel.setLayout(null);
    }

    private void colocarCajas(){
        
        JLabel labelNombre = new JLabel();
        labelNombre.setText("Jugador");
        labelNombre.setBounds(10, 10, 100, 30);
        
        JLabel labelSaldo = new JLabel();
        labelSaldo.setText("Saldo");
        labelSaldo.setBounds(120, 10, 100, 30);
        
        JLabel labelCaballo = new JLabel();
        labelCaballo.setText("Caballo");
        labelCaballo.setBounds(230, 10, 100, 30);
        
        JLabel labelMonto = new JLabel();
        labelMonto.setText("Cantidad a apostar");
        labelMonto.setBounds(340, 10, 140, 30);
        
        JLabel labelMensaje = new JLabel ();
        labelMensaje.setText("");
        labelMensaje.setBounds(10, 340, 600, 30);
        
        //agregamos los nmombres de los caballos al string
        Caballo objCaballos = new Caballo ();
        Caballo arregloCaballos [] = objCaballos.nombreCaballos();
        String [] nombreCaballos = new String [arregloCaballos.length];
        for (int i=0; i<arregloCaballos.length; i++){
           nombreCaballos[i]= arregloCaballos[i].getNombre();
        }
        //datos jugador
        Persona objPersona = new Persona ();
        Persona arregloPersona[] = objPersona.nombrePersona();
        String [] nombrePersona = new String [arregloPersona.length];
        int [] saldoPersona = new int [arregloPersona.length];
        for (int a=0; a<arregloPersona.length; a++){
           nombrePersona[a] = arregloPersona[a].getNombre();
           saldoPersona[a] = arregloPersona[a].getSaldo();
        }
        //campos jugador 1
        JTextField cajaNombre1 = new JTextField(nombrePersona[0]);
        cajaNombre1.setBounds(10, 50, 100, 30);
        
        JLabel saldoPlayer1 = new JLabel(Integer.toString(saldoPersona[0]));
        saldoPlayer1.setBounds(120, 50, 100, 30);
        
        JComboBox listaCaballos = new JComboBox(nombreCaballos);
        listaCaballos.setBounds(230, 50, 100, 30);
        listaCaballos.setEnabled(false);

        JTextField cajaCantidad1 = new JTextField();
        cajaCantidad1.setBounds(340, 50, 100, 30);
        cajaCantidad1.setEnabled(false);
        
        //campos jugador 2
        JTextField cajaNombre2 = new JTextField(nombrePersona[1]);
        cajaNombre2.setBounds(10, 100, 100, 30);
        
        JLabel saldoPlayer2 = new JLabel(Integer.toString(saldoPersona[1]));
        saldoPlayer2.setBounds(120, 100, 100, 30);
    
        JComboBox listaCaballos2 = new JComboBox(nombreCaballos);
        listaCaballos2.setBounds(230, 100, 100, 30);
        listaCaballos2.setEnabled(false);
        
        JTextField cajaCantidad2 = new JTextField();
        cajaCantidad2.setBounds(340, 100, 100, 30);
        cajaCantidad2.setEnabled(false);
        
        //campos jugador 3
        JTextField cajaNombre3 = new JTextField(nombrePersona[2]);
        cajaNombre3.setBounds(10, 150, 100, 30);
        
        JLabel saldoPlayer3 = new JLabel(Integer.toString(saldoPersona[2]));
        saldoPlayer3.setBounds(120, 150, 100, 30);
    
        JComboBox listaCaballos3 = new JComboBox(nombreCaballos);
        listaCaballos3.setBounds(230, 150, 100, 30);
        listaCaballos3.setEnabled(false);
        
        JTextField cajaCantidad3 = new JTextField();
        cajaCantidad3.setBounds(340, 150, 100, 30);
        cajaCantidad3.setEnabled(false);
        
        //campos jugador 4
        JTextField cajaNombre4 = new JTextField(nombrePersona[3]);
        cajaNombre4.setBounds(10, 200, 100, 30);
        
        JLabel saldoPlayer4 = new JLabel(Integer.toString(saldoPersona[3]));
        saldoPlayer4.setBounds(120, 200, 100, 30);
    
        JComboBox listaCaballos4 = new JComboBox(nombreCaballos);
        listaCaballos4.setBounds(230, 200, 100, 30);
        listaCaballos4.setEnabled(false);
        
        JTextField cajaCantidad4 = new JTextField();
        cajaCantidad4.setBounds(340, 200, 100, 30);
        cajaCantidad4.setEnabled(true);

        //boton guardar datos
        JButton btnGuardar = new JButton ("Guardar nombres");
        btnGuardar.setBounds(10,250,200,30);
        //boton jugar
        JButton btnJugar = new JButton ("Jugar");
        btnJugar.setBounds(10,250,200,30);
        btnJugar.setVisible(false);
        btnJugar.setEnabled(false); 
        //acion boton guardar 
        ActionListener accionGuardar = new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                //deshabilitamos los campos de nombre
                if(!cajaNombre1.getText().isEmpty() && !cajaNombre2.getText().isEmpty() && !cajaNombre3.getText().isEmpty() && !cajaNombre4.getText().isEmpty()){
                    cajaNombre1.setEnabled(false);
                    cajaNombre2.setEnabled(false);
                    cajaNombre3.setEnabled(false);
                    cajaNombre4.setEnabled(false);
                    //habilitamos campos
                    listaCaballos.setEnabled(true);
                    cajaCantidad1.setEnabled(true);
                    listaCaballos2.setEnabled(true);
                    cajaCantidad2.setEnabled(true);
                    listaCaballos3.setEnabled(true);
                    cajaCantidad3.setEnabled(true);
                    listaCaballos4.setEnabled(true);
                    cajaCantidad4.setEnabled(true);
                    //ocultar boton
                    btnGuardar.setVisible(false);
                    //
                    btnJugar.setVisible(true);
                    btnJugar.setEnabled(true);
                    arregloPersona[0].setNombre(cajaNombre1.getText());
                    arregloPersona[1].setNombre(cajaNombre2.getText());
                    arregloPersona[2].setNombre(cajaNombre3.getText());
                    arregloPersona[3].setNombre(cajaNombre4.getText());
                }else {
                    JOptionPane.showMessageDialog(null, "Los nombres no pueden estar vacios");
                    
                }
            }
        };
        btnGuardar.addActionListener(accionGuardar);
        //accion boton jugar
        ActionListener accionJugar = new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(Integer.parseInt(cajaCantidad4.getText())>Integer.parseInt(saldoPlayer4.getText())){
                    JOptionPane.showMessageDialog(null, cajaNombre4.getText()+" no tiene fondos suficientes");
                }else if (Integer.parseInt(cajaCantidad3.getText())>Integer.parseInt(saldoPlayer3.getText())){
                    JOptionPane.showMessageDialog(null, cajaNombre3.getText()+" no tiene fondos suficientes");
                }else if (Integer.parseInt(cajaCantidad2.getText())>Integer.parseInt(saldoPlayer2.getText())){
                    JOptionPane.showMessageDialog(null, cajaNombre2.getText()+" no tiene fondos suficientes");
                }else if (Integer.parseInt(cajaCantidad1.getText())>Integer.parseInt(saldoPlayer1.getText())){
                    JOptionPane.showMessageDialog(null, cajaNombre1.getText()+" no tiene fondos suficientes");
                }else{
                    
                    //enviamos el caballo apostado
                    arregloPersona[0].setCabApostado(listaCaballos.getSelectedIndex()+1);
                    arregloPersona[1].setCabApostado(listaCaballos2.getSelectedIndex()+1);
                    arregloPersona[2].setCabApostado(listaCaballos3.getSelectedIndex()+1);
                    arregloPersona[3].setCabApostado(listaCaballos4.getSelectedIndex()+1);

                    //enviamos el saldo apostado de cada jugador
                    arregloPersona[0].setCtdApostar(Integer.parseInt(cajaCantidad1.getText()));
                    arregloPersona[1].setCtdApostar(Integer.parseInt(cajaCantidad2.getText()));
                    arregloPersona[2].setCtdApostar(Integer.parseInt(cajaCantidad3.getText()));
                    arregloPersona[3].setCtdApostar(Integer.parseInt(cajaCantidad4.getText()));
                    
                    //Caballo ganador
                    int caballoGanador = (int)(Math.random()*4+1);
                    int totalApostado = 0;
                    int totalGanadores = 0;
                    //proceso de seleccion de ganadores suma y resta de dinero
                    for (int i = 0; i<4; i++){
                        totalApostado +=  arregloPersona[i].getCtdApostar();
                        //if para saber si aposto al caballo ganador
                        if(caballoGanador==arregloPersona[i].getCabApostado()){
                            if(arregloPersona[i].getSaldo()!=0){
                                totalGanadores++;
                                arregloPersona[i].setGanador(true);
                            }  
                        }else{
                             if(arregloPersona[i].getSaldo()!=0){
                                int saldoActual = arregloPersona[i].getSaldo();
                                int apostado = arregloPersona[i].getCtdApostar();
                                int saldoFinal = saldoActual - apostado;
                                arregloPersona[i].setSaldo(saldoFinal);
                            }  
                        }
                    }
                    int ganancia = totalApostado / totalGanadores;
                    String ganadores="";
                    //recorremos un for paa buscar todos los ganadores
                    for (int i = 0; i<4; i++){
                        if(arregloPersona[i].getGanador()){
                            int saldoAc =  arregloPersona[i].getSaldo();
                            arregloPersona[i].setSaldo(ganancia+saldoAc);
                            ganadores += arregloPersona[i].getNombre()+" ";
                        }
                    }
                    mensaje = "El caballo ganador es: " + arregloCaballos[caballoGanador-1].getNombre()+ " y los jugadores que ganaron: " + ganadores;
                    labelMensaje.setText(mensaje);
                    //atualizamos los saldos en pantalla
                    saldoPlayer1.setText(String.valueOf(arregloPersona[0].getSaldo()));
                    saldoPlayer2.setText(String.valueOf(arregloPersona[1].getSaldo()));
                    saldoPlayer3.setText(String.valueOf(arregloPersona[2].getSaldo()));
                    saldoPlayer4.setText(String.valueOf(arregloPersona[3].getSaldo()));
                }
                //deshabilitar botones si el saldo es 0
                if (arregloPersona[3].getSaldo()==0){
                    listaCaballos4.setEnabled(false);
                    cajaCantidad4.setEnabled(false);
                    jugadoresAc--;
                }
                if (arregloPersona[2].getSaldo()==0){
                    listaCaballos3.setEnabled(false);
                    cajaCantidad3.setEnabled(false);
                    jugadoresAc--;
                }
                if (arregloPersona[1].getSaldo()==0){
                    listaCaballos2.setEnabled(false);
                    cajaCantidad2.setEnabled(false);
                    jugadoresAc--;
                }
                if (arregloPersona[0].getSaldo()==0){
                    listaCaballos.setEnabled(false);
                    cajaCantidad1.setEnabled(false);
                    jugadoresAc--;
                }
                if(jugadoresAc==0){
                    btnGuardar.setEnabled(false);
                    mensaje = "Juego Finalizado";
                }
                
            }
            
        };
        btnJugar.addActionListener(accionJugar);
        
       
        panel.add(labelNombre);
        panel.add(labelSaldo);
        panel.add(labelCaballo);
        panel.add(labelMonto);
        panel.add(labelMensaje);
        
        panel.add(cajaNombre1);
        panel.add(saldoPlayer1);
        panel.add(listaCaballos);
        panel.add(cajaCantidad1);
        
        panel.add(cajaNombre2);
        panel.add(saldoPlayer2);
        panel.add(listaCaballos2);
        panel.add(cajaCantidad2);
        
        panel.add(cajaNombre3);
        panel.add(saldoPlayer3);
        panel.add(listaCaballos3);
        panel.add(cajaCantidad3);
        
        panel.add(cajaNombre4);
        panel.add(saldoPlayer4);
        panel.add(listaCaballos4);
        panel.add(cajaCantidad4);
        
        panel.add(btnGuardar);
        panel.add(btnJugar);
        
    }
}
