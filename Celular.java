
package Celulares1;


public class Celular {
     String nombre; 
     String color; 
     String llamar; 
     String detalles; 
     

    public Celular(String nombre, String color,String llamar,String detalles) {
        this.nombre = nombre;
        this.color = color;
        this.llamar=llamar; 
        this.detalles= detalles; 
    
   }
    public void mostar(){
    System.out.println(" Nombre "+nombre);
    System.out.println(" Color "+color); 
    System.out.println("------------------------------------");
}

    public Celular(){
        
    }
    public void leer(){
        System.out.println(" Llamado de LG "+llamar); 
        System.out.println(" Llamdo de motorola "+detalles);
        System.out.println("--------------------------");
    }
}
