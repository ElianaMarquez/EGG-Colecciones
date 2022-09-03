/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
        //LISTAS
        ArrayList<Integer> numerosA = new ArrayList(); //Lista de tipo Integer
        int x = 20;
        numerosA.add(x); // Agregamos el numero 20 a la lista, en la posicion 0
           //Tarea: Agregar 5 objetos
        for (int i = 0; i < 5; i++) {
            numerosA.add(3);
        }
        System.out.println(numerosA);
        
        //CONJUNTOS
        HashSet<Integer> numerosB = new HashSet();
        Integer y = 20;
        numerosB.add(y);
           //Tarea: Agregar 5 objetos
           for (int i = 0; i < 5; i++) {
            numerosB.add(i+1);
        }
           System.out.println(numerosB);
        
        //MAPAS
        HashMap<Integer, String> alumnos = new HashMap();
        int dni = 34576189;
        String nombreAlumno = "Pepe";
        alumnos.put(dni, nombreAlumno); //Agregamos la llave y el valor
           //Tarea: Agregar 5 objetos
           for (int i = 0; i < 2; i++) {
               System.out.println("Ingrese DNI:");
               dni = leer.nextInt();
               System.out.println("Ingrese NOMBRE:");
               nombreAlumno = leer.next();
               alumnos.put(dni, nombreAlumno);
        }
           System.out.println(alumnos);
           
           //Eliminar en cada conjunto un objeto de cada forma que aprendimos.
           //LISTAS
           numerosA.remove(3);
           
           //CONJUNTOS
           numerosB.remove(4);
           
           //MAPAS
           alumnos.remove(222);
           
  /*
      //DETECCION DE ERRORES - PAGINA 10 
   HashMap<String, String> personas = new HashMap<>();
String n1 = "Albus";
String n2 = "Severus";
personas.add(n1, n2);
      */

 /* DETECCION DE ERRORES, PAGINA 11  
    ArrayList<String> bebidas = new ArrayList<>();
bebidas.add("café");
bebidas.add("té");
Iterator<String> it =bebidas.iterator();
while (it.hasNext()){
    if (it.next().equals("café")){
it.remove();
}

 }
*/
 
}

}