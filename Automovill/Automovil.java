
package Automovill;

/**
 *
 * @author Luis E. Vargas
 */
public class Automovil {
    /* Requisitos:
Agregar 4 atributos
Agregar 4 métodos
Aplicar encapsulación (atributos privados + setters y getters)
Imprimir el nombre de la clase en el constructor: "Constructor de AutoMovil"*/
    
    private String marca;
    private String modelo;
    private String color;
    private int anio;
    private boolean prendido;
    
    /*Este es el constructor Vacio*/
    public Automovil(){
        System.out.println("Constructor de AutoMovil");
    }

    /*Aqui usamos la sobrecarga de constructor constructor*/
    public Automovil(String marca, String modelo, String color, int anio, boolean prendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.color =  color;
        this.anio = anio;
        this.prendido = prendido;
        System.out.println("Constructor de AutoMovil");
    }
    /*Definimos los getters para poder usar los atributos privados*/
    public String getMarca(){return this.marca;}
    public String getModelo(){return this.modelo;}
    public String getColor(){return color;}
    public int getAnio(){return anio;}
    public boolean getPrendido(){return prendido;}
    /*Aqui definimos los Setters, los cuales se usaran para poder modificar esos atributos privados*/
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void setPrendido(boolean prendido){
        this.prendido = prendido;
    }
    /*Y aqui es donde definimos los metodos que vamos a utilizar,
    las acciones que van a realizar los objetos.
    */
    
    public void Prender(){
          if(prendido != false){
        System.out.println("El carro esta encendido");
        
          }else{
            System.out.println("Prendiendo carro");
          setPrendido(prendido = true);   
        }
    }

    public void Arrancar(){
        System.out.println("El carro esta arrancando");
    }

    
    public void Frenar(){
        System.out.println("El carro se esta deteniendo");
    }    


    public void Apagar(){
    if(prendido != true){
        System.out.println("El carro esta apagado");
    }else{
        System.out.println("Apagando el carro...");
       setPrendido(prendido = false);
    }
    
    }    
    
    
    
}
