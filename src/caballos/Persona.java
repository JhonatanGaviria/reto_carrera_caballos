
package caballos;

public class Persona {
    //atributos
    String nombre;
    int saldo;
    int cabApostado;
    int ctdApostar;
    Boolean ganador;
    
    //constructores
    public Persona(){
        nombre = "";
        saldo = 20000;
        cabApostado = 0;
        ctdApostar = 0;
        ganador = false;
    }
    public Persona (String nombre, int saldo, int cabApostado, int ctdApostar, Boolean ganador){
        this.nombre = nombre;
        this.saldo = saldo;
        this.cabApostado = cabApostado;
        this.ctdApostar = ctdApostar;
        this.ganador = ganador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getCabApostado() {
        return cabApostado;
    }

    public void setCabApostado(int cabApostado) {
        this.cabApostado = cabApostado;
    }

    public int getCtdApostar() {
        return ctdApostar;
    }

    public void setCtdApostar(int ctdApostar) {
        this.ctdApostar = ctdApostar;
    }

    public Boolean getGanador() {
        return ganador;
    }

    public void setGanador(Boolean ganador) {
        this.ganador = ganador;
    }
    
    public Persona [] nombrePersona (){
        Persona listaPersona[]=new Persona[4];
        listaPersona [0]  = new Persona ("",20000, 0, 0, false);
        listaPersona [1] = new Persona ("",20000, 0, 0, false);
        listaPersona [2]= new Persona ("",20000, 0, 0, false);
        listaPersona [3]= new Persona ("",20000, 0, 0, false);
        return listaPersona;
    }
}
