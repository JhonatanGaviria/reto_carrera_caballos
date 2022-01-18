package caballos;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Caballo {
    private int id;
    private String nombre;
    
    public Caballo(){
        this.id=0;
        this.nombre="";
    }
    public Caballo (int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Caballo [] nombreCaballos (){
        Caballo listaCaballo[]=new Caballo[4];
        listaCaballo [0] =new Caballo (1, "Mostufa");
        listaCaballo [1] =new Caballo (2, "Omicron");
        listaCaballo [2] =new Caballo (3, "Paracron");
        listaCaballo [3] =new Caballo (4, "Trueno");
        return listaCaballo;
    }
}
