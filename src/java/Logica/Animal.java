package Logica;

public class Animal {
    
    protected String nombre;
    protected String genero;
    protected String habitat;
    protected String comportamiento;
    protected String color;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getComportamiento() {
        return comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void devolverComportamiento(){}
    public void devolverGenero(){}
    public void devolverHabitat(){}
    public void devolverColor(){}
   
}
