
package Logica;

import java.util.Random;


public class Gato extends Animal {
     
    @Override
    public void devolverComportamiento()
    {
     this.comportamiento ="El comportamientos comunes incluyen técnicas de caza y reacciones"
             + " a ciertos eventos como interacciones con humanos u otros animales. ";   
    }
    
    @Override
    public void devolverGenero()
    {
        String[] genero = new String[]{"Masculino","Femenino"};
        Random r = new Random();
        int posicion = r.nextInt(genero.length);
        
        this.genero = genero[posicion];
    }
    
    @Override
    public void devolverHabitat()
    {
        this.habitat = "Lugares altos";
    }
    @Override
    public void devolverColor()
    {
        String[] color = new String[]{"Gris con manchas negras","Naranja con manchas negras",
                                       "Negra con manchas blancas","Negro","blanco","Naranja"};
        Random r = new Random();
        int posicion = r.nextInt(color.length);
        this.color = color[posicion];
    }
    
}
