
package Ej1_ListaDePerros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class Guia8_Colecciones {

    
    public static void main(String[] args) {
       String raza;
       ArrayList<String>perros = new ArrayList();
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       String op;
       
       do {
        System.out.println("Desea agregar una nueva mascota?");
         op = leer.next();
         if (!op.equalsIgnoreCase("s") && !op.equalsIgnoreCase("n")){
              System.out.println("La opción no es correcta, debe ingresar N / S");
         }
         if(op.equalsIgnoreCase("s")){
             System.out.println("Indique la raza");
             raza = leer.next();
             perros.add(raza);
           
         }
        
       }while(!op.equalsIgnoreCase("n") ); 
       
        System.out.println(perros);
         
        //Eliminar un perro con iterator
        System.out.println("Elija un perro para eliminar de la lista");
        String perroElimina = leer.next();
        int cont = 0; 
        Iterator<String> it = perros.iterator();
        
        while (it.hasNext()){
            String aux = it.next();
            if (aux.equalsIgnoreCase(perroElimina)){
                it.remove();
                cont++;
            }else {
            }
        }
        if (cont == 0){
         System.out.println("El perro no se encuentra en la lista");   
        }
         
        Collections.sort(perros);
        System.out.println(perros);
        
       
    }
    
}
