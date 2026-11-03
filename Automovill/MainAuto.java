/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Automovill;

/**
 *
 * @author 
 */
public class MainAuto {
    public static void main(String[] args) {
  //Aqui se crea la instancia de Automovil
        Automovil auto = new Automovil();
        auto.setMarca("Toyota");
        auto.setModelo("Corolla");
        auto.setAnio(2023);
        auto.setColor("Blanco");

        System.out.println("Marca: " + auto.getMarca());
        auto.Prender();
        auto.Arrancar();

        System.out.println("\n--- Honda Civic ---");
  //Y aqui se crea la instancia hija de HondaCivic
        HondaCivic honda = new HondaCivic("","","",0,false);
        
        honda.getModelo();
        honda.setAnio(2024);
        honda.setColor("Rojo");

        System.out.println("Marca: " + honda.getMarca());
        System.out.println("Anio: " + honda.getAnio());
        honda.Prender(); 
        honda.Arrancar();
        honda.Apagar();
      
    }
}
