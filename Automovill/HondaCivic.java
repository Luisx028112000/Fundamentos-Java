package Automovill;

/**
 *
 * @author Luis E. Vargas
 */
    /*Requisitos:
Debe heredar de la clase AutoMovil usando extends
Imprimir el nombre de la clase en el constructor: "Constructor de HondaCivic"
Sobrescribir dos métodos de la clase padre*/
    
public class HondaCivic extends Automovil{
    
//Aqui hacemos el constructor vacio, pero extrayendo la clase padre de AutoMovil
    public HondaCivic(){
        super();
        System.out.println("Constructor de Honda Civic");
        
    }
    
    
    //Aqui hacemos el constructor sobrecargado, usando el super, para usar los atributos padre
    public HondaCivic(String marca, String modelo, String color, int anio, boolean prendido){
        super("Honda","Civic",color,anio,prendido);
        System.out.println("Constructor de Honda Civic");
    }
    
    public HondaCivic(String marca, String modelo){
        super("Honda","Civic","",0,false);
        System.out.println("Constructor de Honda Civic");
    }
    
    //El @Override lo usamos para que el programa sepa que es un metodo sobreescrito
   @Override
   public void Prender(){
         if(super.getPrendido() != false){
        System.out.println("El carro esta encendido");
        }else{
            System.out.println("Prendiendo carro");
            super.setPrendido(true);
        }
   }
   
    @Override
    public void Apagar(){
    if(super.getPrendido() != true){
        System.out.println("El carro esta apagado");
    }else{
        System.out.println("Apagando el carro...");
        super.setPrendido(false);
    }
    
    }
    
}
