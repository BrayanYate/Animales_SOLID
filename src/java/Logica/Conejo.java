
package Logica;

import java.util.Random;

public class Conejo extends Animal{
    @Override
    public void devolverComportamiento()
    {
        
     this.comportamiento ="Los conejos son animales muy curiosos y les encanta explorar "
             + "todo lo que hay a su alrededor.Puede jugar a perseguir a otros conejos o "
             + "al mismo propietario corriendo detrás de él";   
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
        this.habitat = "Lugares amplios";
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
